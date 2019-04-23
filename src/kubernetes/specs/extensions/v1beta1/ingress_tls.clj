(ns kubernetes.specs.extensions/v1beta1/ingress-tls
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def extensions/v1beta1/ingress-tls-data
  {
   (ds/opt :hosts) (s/coll-of string?)
   (ds/opt :secretName) string?
   })

(def extensions/v1beta1/ingress-tls-spec
  (ds/spec
    {:name ::extensions/v1beta1/ingress-tls
     :spec extensions/v1beta1/ingress-tls-data}))
