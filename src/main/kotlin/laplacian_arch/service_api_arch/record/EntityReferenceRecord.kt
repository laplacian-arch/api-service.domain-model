package laplacian_arch.service_api_arch.record
import com.github.jknack.handlebars.Context
import laplacian_arch.service_api_arch.model.EntityReference


import laplacian_arch.service_api_arch.model.Datasource


import laplacian.metamodel.model.Entity

import laplacian.metamodel.record.EntityRecord


import laplacian.util.*

/**
 * entity_reference
 */
data class EntityReferenceRecord (
    private val __record: Record,
    private val _context: Context,

    /**
     * the datasource which aggregates this entity_reference
     */
    override val datasource: Datasource,

    private val _record: Record = __record.normalizeCamelcase()
): EntityReference, Record by _record {

    /**
     * The entity_name of this entity_reference.
     */
    override val entityName: String
        get() = getOrThrow("entityName")



    /**
     * entity
     */
    override val entity: Entity
        get() = EntityRecord.from(_context).find {
            it.name == entityName
        } ?: throw IllegalStateException(
            "There is no entity which meets the following condition(s): "
            + "EntityReference.entity_name == entity.name (=$entityName) "
            + "Possible values are: " + EntityRecord.from(_context).map {
              "(${ it.name })"
            }.joinToString()
        )

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, datasource: Datasource) = records.map {
            EntityReferenceRecord(it, _context, datasource = datasource)
        }
    }
}