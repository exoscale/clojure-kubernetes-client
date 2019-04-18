(ns kubernetes.specs.v1beta1/replica-set-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/replica-set :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/replica-set-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta1/replica-set-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1beta1/replica-set-list-spec
  (ds/spec
    {:name ::v1beta1/replica-set-list
     :spec v1beta1/replica-set-list-data}))
