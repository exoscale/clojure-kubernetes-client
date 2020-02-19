(ns clojure-kubernetes-client.specs.v1alpha1-limited-priority-level-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-limit-response :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-limited-priority-level-configuration-data v1alpha1-limited-priority-level-configuration)
(def v1alpha1-limited-priority-level-configuration-data
  {
   (ds/opt :assuredConcurrencyShares) int?
   (ds/opt :limitResponse) v1alpha1-limit-response
   })

(def v1alpha1-limited-priority-level-configuration
  (ds/spec
    {:name ::v1alpha1-limited-priority-level-configuration
     :spec v1alpha1-limited-priority-level-configuration-data}))

