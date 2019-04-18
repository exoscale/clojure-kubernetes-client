(ns kubernetes.specs.v1beta1/certificate-signing-request-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/certificate-signing-request-spec-data
  {
   (ds/opt :extra) (s/map-of string? (s/coll-of string?))
   (ds/opt :groups) (s/coll-of string?)
   (ds/req :request) any?
   (ds/opt :uid) string?
   (ds/opt :usages) (s/coll-of string?)
   (ds/opt :username) string?
   })

(def v1beta1/certificate-signing-request-spec-spec
  (ds/spec
    {:name ::v1beta1/certificate-signing-request-spec
     :spec v1beta1/certificate-signing-request-spec-data}))
