(ns kubernetes.specs.networking/v1beta1/ingress-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.networking/v1beta1/ingress :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def networking/v1beta1/ingress-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of networking/v1beta1/ingress-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def networking/v1beta1/ingress-list-spec
  (ds/spec
    {:name ::networking/v1beta1/ingress-list
     :spec networking/v1beta1/ingress-list-data}))
