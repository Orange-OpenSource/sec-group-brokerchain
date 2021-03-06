package com.orange.cloud.servicebroker.filter.securitygroups.filter;

import org.immutables.value.Value;

/**
 * @author Sebastien Bortolussi
 */
@Value.Immutable
public abstract class RuleDescription {

    public abstract String servicebindingId();

    public abstract String serviceInstanceName();

    public abstract String serviceBrokerName();

    @Value.Derived
    public String value() {
        return String.format("generated by sec group filter broker for service binding %s to allow access to service instance %s created from service broker %s.", servicebindingId(), serviceInstanceName(), serviceBrokerName());
    }

}
