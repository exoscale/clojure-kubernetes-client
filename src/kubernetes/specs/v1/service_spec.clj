(ns kubernetes.specs.v1/service-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/service-port :refer :all]
            [kubernetes.specs.v1/session-affinity-config :refer :all]
            )
  (:import (java.io File)))


(def v1/service-spec-data
  {
   (ds/opt :clusterIP) string?
   (ds/opt :externalIPs) (s/coll-of string?)
   (ds/opt :externalName) string?
   (ds/opt :externalTrafficPolicy) string?
   (ds/opt :healthCheckNodePort) int?
   (ds/opt :loadBalancerIP) string?
   (ds/opt :loadBalancerSourceRanges) (s/coll-of string?)
   (ds/opt :ports) (s/coll-of v1/service-port-spec)
   (ds/opt :publishNotReadyAddresses) boolean?
   (ds/opt :selector) (s/map-of string? string?)
   (ds/opt :sessionAffinity) string?
   (ds/opt :sessionAffinityConfig) v1/session-affinity-config-spec
   (ds/opt :type) string?
   })

(def v1/service-spec-spec
  (ds/spec
    {:name ::v1/service-spec
     :spec v1/service-spec-data}))
