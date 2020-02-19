(ns clojure-kubernetes-client.specs.v1alpha1-flow-schema-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-flow-distinguisher-method :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-reference :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-policy-rules-with-subjects :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-flow-schema-spec-data v1alpha1-flow-schema-spec)
(def v1alpha1-flow-schema-spec-data
  {
   (ds/opt :distinguisherMethod) v1alpha1-flow-distinguisher-method
   (ds/opt :matchingPrecedence) int?
   (ds/req :priorityLevelConfiguration) v1alpha1-priority-level-configuration-reference
   (ds/opt :rules) (s/coll-of v1alpha1-policy-rules-with-subjects)
   })

(def v1alpha1-flow-schema-spec
  (ds/spec
    {:name ::v1alpha1-flow-schema-spec
     :spec v1alpha1-flow-schema-spec-data}))

