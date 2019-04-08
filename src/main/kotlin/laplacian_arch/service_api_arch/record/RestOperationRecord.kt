package laplacian_arch.service_api_arch.record
import com.github.jknack.handlebars.Context
import laplacian_arch.service_api_arch.model.RestOperation


import laplacian_arch.service_api_arch.model.RestResource


import laplacian.metamodel.model.Entity

import laplacian.metamodel.record.EntityRecord


import laplacian_arch.service_api_arch.model.RestDataItem


import laplacian.util.*

/**
 * rest_operation
 */
data class RestOperationRecord (
    private val __record: Record,
    private val _context: Context,

    /**
     * the resource which aggregates this rest_operation
     */
    override val resource: RestResource,

    private val _record: Record = __record.normalizeCamelcase()
): RestOperation, Record by _record {

    /**
     * The method of this rest_operation.
     */
    override val method: String
        get() = getOrThrow("method")

    /**
     * The path of this rest_operation.
     */
    override val path: String
        get() = getOrThrow("path") {
            "/"
        }

    /**
     * The name of this rest_operation.
     */
    override val name: String
        get() = getOrThrow("name") {
            identifier
        }

    /**
     * The identifier of this rest_operation.
     */
    override val identifier: String
        get() = getOrThrow("identifier") {
            method.lowerUnderscorize() + "_" +
            if (path == "/") {
                resource.identifier.pluralize()
            }
            else {
                path.lowerUnderscorize()
            }
        }

    /**
     * The namespace of this rest_operation.
     */
    override val namespace: String
        get() = getOrThrow("namespace") {
            "${resource.namespace}.$identifier"
        }

    /**
     * The description of this rest_operation.
     */
    override val description: String
        get() = getOrThrow("description") {
            name
        }






    /**
     * path_parameters
     */
    override val pathParameters: List<RestDataItem>
        = RestDataItemRecord.from(getList("path_parameters", emptyList()), _context, this)

    /**
     * request_headers
     */
    override val requestHeaders: List<RestDataItem>
        = RestDataItemRecord.from(getList("request_headers", emptyList()), _context, this)

    /**
     * query_parameters
     */
    override val queryParameters: List<RestDataItem>
        = RestDataItemRecord.from(getList("query_parameters", emptyList()), _context, this)

    /**
     * request_body
     */
    override val requestBody: List<RestDataItem>
        = RestDataItemRecord.from(getList("request_body", emptyList()), _context, this)

    /**
     * response_headers
     */
    override val responseHeaders: List<RestDataItem>
        = RestDataItemRecord.from(getList("response_headers", emptyList()), _context, this)

    /**
     * response_body
     */
    override val responseBody: List<RestDataItem>
        = RestDataItemRecord.from(getList("response_body", emptyList()), _context, this)


    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, resource: RestResource) = records.map {
            RestOperationRecord(it, _context, resource = resource)
        }
    }
}