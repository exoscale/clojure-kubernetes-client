(ns kubernetes.specs.v1beta1/ingress-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/ingress-backend :refer :all]
            [kubernetes.specs.v1beta1/ingress-rule :refer :all]
            [kubernetes.specs.v1beta1/ingress-tls :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/ingress-spec-data
  {
   (ds/opt :backend) v1beta1/ingress-backend-spec
   (ds/opt :rules) (s/coll-of v1beta1/ingress-rule-spec)
   (ds/opt :tls) (s/coll-of v1beta1/ingress-tls-spec)
   })

(def v1beta1/ingress-spec-spec
  (ds/spec
    {:name ::v1beta1/ingress-spec
     :spec v1beta1/ingress-spec-data}))
