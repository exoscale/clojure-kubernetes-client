(ns kubernetes.specs.networking/v1beta1/ingress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-spec :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-status :refer :all]
            )
  (:import (java.io File)))


(def networking/v1beta1/ingress-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) networking/v1beta1/ingress-spec-spec
   (ds/opt :status) networking/v1beta1/ingress-status-spec
   })

(def networking/v1beta1/ingress-spec
  (ds/spec
    {:name ::networking/v1beta1/ingress
     :spec networking/v1beta1/ingress-data}))
