(ns kubernetes.specs.v1alpha1/initializer-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/initializer :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/initializer-configuration-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :initializers) (s/coll-of v1alpha1/initializer-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   })

(def v1alpha1/initializer-configuration-spec
  (ds/spec
    {:name ::v1alpha1/initializer-configuration
     :spec v1alpha1/initializer-configuration-data}))
