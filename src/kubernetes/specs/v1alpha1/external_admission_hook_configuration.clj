(ns kubernetes.specs.v1alpha1/external-admission-hook-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/external-admission-hook :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/external-admission-hook-configuration-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :externalAdmissionHooks) (s/coll-of v1alpha1/external-admission-hook-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   })

(def v1alpha1/external-admission-hook-configuration-spec
  (ds/spec
    {:name ::v1alpha1/external-admission-hook-configuration
     :spec v1alpha1/external-admission-hook-configuration-data}))
