(ns clojure-kubernetes-client.specs.v1-webhook-conversion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.apiextensions-v1-webhook-client-config :refer :all]
            )
  (:import (java.io File)))


(declare v1-webhook-conversion-data v1-webhook-conversion)
(def v1-webhook-conversion-data
  {
   (ds/opt :clientConfig) apiextensions-v1-webhook-client-config
   (ds/req :conversionReviewVersions) (s/coll-of string?)
   })

(def v1-webhook-conversion
  (ds/spec
    {:name ::v1-webhook-conversion
     :spec v1-webhook-conversion-data}))

