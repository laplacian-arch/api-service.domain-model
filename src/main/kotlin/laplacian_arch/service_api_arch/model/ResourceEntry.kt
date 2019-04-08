package laplacian_arch.service_api_arch.model


import laplacian.util.*

/**
 * resource_entry
 */
interface ResourceEntry {
    /**
     * The resource_name of this resource_entry.
     */
    val resourceName: String
    /**
     * service
     */
    val service: Service
    /**
     * resource
     */
    val resource: RestResource
}