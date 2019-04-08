package laplacian_arch.service_api_arch.record
import com.github.jknack.handlebars.Context
import laplacian_arch.service_api_arch.model.DataAccess

import laplacian_arch.service_api_arch.model.DataAccessList


import laplacian.metamodel.model.Entity

import laplacian.metamodel.record.EntityRecord


import laplacian.util.*

/**
 * data_access
 */
data class DataAccessRecord (
    private val __record: Record,
    private val _context: Context,

    private val _record: Record = __record.normalizeCamelcase()
): DataAccess, Record by _record {

    /**
     * The entity_name of this data_access.
     */
    override val entityName: String
        get() = getOrThrow("entityName")

    /**
     * The cardinality of this data_access.
     */
    override val cardinality: String
        get() = getOrThrow("cardinality") {
            "*"
        }

    /**
     * Defines this data_access is multiple or not.
     */
    override val multiple: Boolean
        get() = getOrThrow("multiple") {
            cardinality.let{ it.contains("*") }
        }

    /**
     * The type of this data_access.
     */
    override val type: String
        get() = getOrThrow("type") {
            "${entityName.upperCamelize()}Entity".let { className ->
                if (multiple) "List<$className>" else className
            }
        }

    /**
     * The name of this data_access.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * The identifier of this data_access.
     */
    override val identifier: String
        get() = getOrThrow("identifier") {
            name.lowerUnderscorize()
        }

    /**
     * The description of this data_access.
     */
    override val description: String
        get() = getOrThrow("description") {
            name
        }

    /**
     * The script_type of this data_access.
     */
    override val scriptType: String
        get() = getOrThrow("scriptType")

    /**
     * The script_body of this data_access.
     */
    override val scriptBody: String
        get() = getOrThrow("scriptBody")


    /**
     * entity
     */
    override val entity: Entity
        get() = EntityRecord.from(_context).find {
            it.name == entityName
        } ?: throw IllegalStateException(
            "There is no entity which meets the following condition(s): "
            + "DataAccess.entity_name == entity.name (=$entityName) "
            + "Possible values are: " + EntityRecord.from(_context).map {
              "(${ it.name })"
            }.joinToString()
        )

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(_context: Context): DataAccessList {
            return _context.get("data_accesses") as DataAccessList
        }
    }
}