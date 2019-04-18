(ns kubernetes.specs.v1/service-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/local-object-reference :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/service-account-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :automountServiceAccountToken) boolean?
   (ds/opt :imagePullSecrets) (s/coll-of v1/local-object-reference-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :secrets) (s/coll-of v1/object-reference-spec)
   })

(def v1/service-account-spec
  (ds/spec
    {:name ::v1/service-account
     :spec v1/service-account-data}))
