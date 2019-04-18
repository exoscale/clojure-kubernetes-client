(ns kubernetes.specs.apps/v1beta1/deployment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.apps/v1beta1/deployment :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def apps/v1beta1/deployment-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of apps/v1beta1/deployment-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def apps/v1beta1/deployment-list-spec
  (ds/spec
    {:name ::apps/v1beta1/deployment-list
     :spec apps/v1beta1/deployment-list-data}))
