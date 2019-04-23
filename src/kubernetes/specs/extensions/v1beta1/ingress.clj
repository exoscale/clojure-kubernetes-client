(ns kubernetes.specs.extensions/v1beta1/ingress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-spec :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-status :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/ingress-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) extensions/v1beta1/ingress-spec-spec
   (ds/opt :status) extensions/v1beta1/ingress-status-spec
   })

(def extensions/v1beta1/ingress-spec
  (ds/spec
    {:name ::extensions/v1beta1/ingress
     :spec extensions/v1beta1/ingress-data}))
