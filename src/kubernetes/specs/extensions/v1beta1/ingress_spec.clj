(ns kubernetes.specs.extensions/v1beta1/ingress-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/ingress-backend :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-rule :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-tls :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/ingress-spec-data
  {
   (ds/opt :backend) extensions/v1beta1/ingress-backend-spec
   (ds/opt :rules) (s/coll-of extensions/v1beta1/ingress-rule-spec)
   (ds/opt :tls) (s/coll-of extensions/v1beta1/ingress-tls-spec)
   })

(def extensions/v1beta1/ingress-spec-spec
  (ds/spec
    {:name ::extensions/v1beta1/ingress-spec
     :spec extensions/v1beta1/ingress-spec-data}))
