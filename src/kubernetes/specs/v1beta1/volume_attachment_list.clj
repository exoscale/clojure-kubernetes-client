(ns kubernetes.specs.v1beta1/volume-attachment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/volume-attachment :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/volume-attachment-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta1/volume-attachment-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1beta1/volume-attachment-list-spec
  (ds/spec
    {:name ::v1beta1/volume-attachment-list
     :spec v1beta1/volume-attachment-list-data}))
