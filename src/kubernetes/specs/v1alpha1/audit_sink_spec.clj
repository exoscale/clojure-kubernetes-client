(ns kubernetes.specs.v1alpha1/audit-sink-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/policy :refer :all]
            [kubernetes.specs.v1alpha1/webhook :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/audit-sink-spec-data
  {
   (ds/req :policy) v1alpha1/policy-spec
   (ds/req :webhook) v1alpha1/webhook-spec
   })

(def v1alpha1/audit-sink-spec-spec
  (ds/spec
    {:name ::v1alpha1/audit-sink-spec
     :spec v1alpha1/audit-sink-spec-data}))
