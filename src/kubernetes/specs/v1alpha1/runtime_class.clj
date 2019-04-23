(ns kubernetes.specs.v1alpha1/runtime-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1alpha1/runtime-class-spec :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/runtime-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :spec) v1alpha1/runtime-class-spec-spec
   })

(def v1alpha1/runtime-class-spec
  (ds/spec
    {:name ::v1alpha1/runtime-class
     :spec v1alpha1/runtime-class-data}))
