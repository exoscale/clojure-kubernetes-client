(ns kubernetes.specs.networking/v1beta1/ingress-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.networking/v1beta1/ingress-backend :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-rule :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-tls :refer :all]
            )
  (:import (java.io File)))


(def networking/v1beta1/ingress-spec-data
  {
   (ds/opt :backend) networking/v1beta1/ingress-backend-spec
   (ds/opt :rules) (s/coll-of networking/v1beta1/ingress-rule-spec)
   (ds/opt :tls) (s/coll-of networking/v1beta1/ingress-tls-spec)
   })

(def networking/v1beta1/ingress-spec-spec
  (ds/spec
    {:name ::networking/v1beta1/ingress-spec
     :spec networking/v1beta1/ingress-spec-data}))
