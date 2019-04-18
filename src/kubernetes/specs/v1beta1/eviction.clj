(ns kubernetes.specs.v1beta1/eviction
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/delete-options :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/eviction-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :deleteOptions) v1/delete-options-spec
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   })

(def v1beta1/eviction-spec
  (ds/spec
    {:name ::v1beta1/eviction
     :spec v1beta1/eviction-data}))
