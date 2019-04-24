(ns clojure-kubernetes-client.specs.v1beta1-aggregation-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-aggregation-rule-data v1beta1-aggregation-rule)
(def v1beta1-aggregation-rule-data
  {
   (ds/opt :clusterRoleSelectors) (s/coll-of v1-label-selector)
   })

(def v1beta1-aggregation-rule
  (ds/spec
    {:name ::v1beta1-aggregation-rule
     :spec v1beta1-aggregation-rule-data}))

