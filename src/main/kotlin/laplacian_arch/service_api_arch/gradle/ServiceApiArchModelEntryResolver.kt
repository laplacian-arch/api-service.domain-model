package laplacian_arch.service_api_arch.gradle
import laplacian.gradle.task.generate.ExecutionContext
import laplacian.gradle.task.generate.ModelEntryResolver

import laplacian_arch.service_api_arch.model.DatasourceList
import laplacian_arch.service_api_arch.record.DatasourceRecord

import laplacian_arch.service_api_arch.model.ServiceList
import laplacian_arch.service_api_arch.record.ServiceRecord

import laplacian_arch.service_api_arch.model.RestResourceList
import laplacian_arch.service_api_arch.record.RestResourceRecord

import laplacian_arch.service_api_arch.model.DataAccessList
import laplacian_arch.service_api_arch.record.DataAccessRecord

import laplacian.util.*

class ServiceApiArchModelEntryResolver: ModelEntryResolver {

    override fun resolves(key: String, model: Map<String, RecordList>): Boolean {
        return arrayOf(
            "datasources",
            "services",
            "rest_resources",
            "data_accesses"
        ).any { it == key }
    }

    override fun resolve(key: String, model: Map<String, RecordList>, context: ExecutionContext): Any? {
        return when (key) {
            "datasources" -> DatasourceList(
                model.getList<Record>("datasources").map{ DatasourceRecord(it, context.currentModel) },
                context.currentModel
            )
            "services" -> ServiceList(
                model.getList<Record>("services").map{ ServiceRecord(it, context.currentModel) },
                context.currentModel
            )
            "rest_resources" -> RestResourceList(
                model.getList<Record>("rest_resources").map{ RestResourceRecord(it, context.currentModel) },
                context.currentModel
            )
            "data_accesses" -> DataAccessList(
                model.getList<Record>("data_accesses").map{ DataAccessRecord(it, context.currentModel) },
                context.currentModel
            )
            else -> throw IllegalArgumentException("Unknown key: $key")
        }
    }
}