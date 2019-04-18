(ns kubernetes.specs.v1alpha1/external-admission-hook
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/admission-hook-client-config :refer :all]
            [kubernetes.specs.v1alpha1/rule-with-operations :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/external-admission-hook-data
  {
   (ds/req :clientConfig) v1alpha1/admission-hook-client-config-spec
   (ds/opt :failurePolicy) string?
   (ds/req :name) string?
   (ds/opt :rules) (s/coll-of v1alpha1/rule-with-operations-spec)
   })

(def v1alpha1/external-admission-hook-spec
  (ds/spec
    {:name ::v1alpha1/external-admission-hook
     :spec v1alpha1/external-admission-hook-data}))
