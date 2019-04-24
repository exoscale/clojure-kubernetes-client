(ns clojure-kubernetes-client.specs.v1-daemon-set-update-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-rolling-update-daemon-set :refer :all]
            )
  (:import (java.io File)))


(declare v1-daemon-set-update-strategy-data v1-daemon-set-update-strategy)
(def v1-daemon-set-update-strategy-data
  {
   (ds/opt :rollingUpdate) v1-rolling-update-daemon-set
   (ds/opt :type) string?
   })

(def v1-daemon-set-update-strategy
  (ds/spec
    {:name ::v1-daemon-set-update-strategy
     :spec v1-daemon-set-update-strategy-data}))

