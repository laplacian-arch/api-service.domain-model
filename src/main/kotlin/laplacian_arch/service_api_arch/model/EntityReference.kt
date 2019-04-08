package laplacian_arch.service_api_arch.model

import laplacian.metamodel.model.Entity


import laplacian.util.*

/**
 * entity_reference
 */
interface EntityReference {
    /**
     * The entity_name of this entity_reference.
     */
    val entityName: String
    /**
     * datasource
     */
    val datasource: Datasource
    /**
     * entity
     */
    val entity: Entity
}