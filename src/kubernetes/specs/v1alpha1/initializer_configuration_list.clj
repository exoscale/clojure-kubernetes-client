(ns kubernetes.specs.v1alpha1/initializer-configuration-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/initializer-configuration :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/initializer-configuration-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1alpha1/initializer-configuration-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1alpha1/initializer-configuration-list-spec
  (ds/spec
    {:name ::v1alpha1/initializer-configuration-list
     :spec v1alpha1/initializer-configuration-list-data}))
