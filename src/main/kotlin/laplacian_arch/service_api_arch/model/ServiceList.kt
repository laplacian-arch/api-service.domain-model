package laplacian_arch.service_api_arch.model
import com.github.jknack.handlebars.Context

import laplacian_arch.datasource.model.Datasource

import laplacian.metamodel.model.Entity

import laplacian.util.*

/**
 * A container for records of service
 */
class ServiceList(
    list: List<Service>,
    val context: Context
) : List<Service> by list {
    val inNamespace: List<Service>
        get() = filter {
            it.namespace.startsWith(context.get("project.namespace") as String)
        }
}