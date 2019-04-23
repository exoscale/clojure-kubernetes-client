(ns kubernetes.specs.v1beta1/runtime-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/runtime-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :handler) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   })

(def v1beta1/runtime-class-spec
  (ds/spec
    {:name ::v1beta1/runtime-class
     :spec v1beta1/runtime-class-data}))
