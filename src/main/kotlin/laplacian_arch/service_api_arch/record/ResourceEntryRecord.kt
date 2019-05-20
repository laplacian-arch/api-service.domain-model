package laplacian_arch.service_api_arch.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.service_api_arch.model.ResourceEntry
import laplacian_arch.service_api_arch.model.Service
import laplacian_arch.service_api_arch.model.RestResource
import laplacian.util.*
/**
 * resource_entry
 */
data class ResourceEntryRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the service which aggregates this resource_entry
     */
    override val service: Service,
    private val _record: Record = __record.normalizeCamelcase()
): ResourceEntry, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The resource_name of this resource_entry.
     */
    override val resourceName: String
        get() = getOrThrow("resourceName")

    /**
     * resource
     */
    override val resource: RestResource
        get() = RestResourceRecord.from(_context).find {
            it.name == resourceName
        } ?: throw IllegalStateException(
            "There is no rest_resource which meets the following condition(s): "
            + "ResourceEntry.resource_name == rest_resource.name (=$resourceName) "
            + "Possible values are: " + RestResourceRecord.from(_context).map {
              "(${ it.name })"
            }.joinToString()
        )

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, service: Service) = records.map {
            ResourceEntryRecord(it, _context, service = service)
        }
    }
}