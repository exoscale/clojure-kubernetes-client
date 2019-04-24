(ns clojure-kubernetes-client.specs.v1-se-linux-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-se-linux-options-data v1-se-linux-options)
(def v1-se-linux-options-data
  {
   (ds/opt :level) string?
   (ds/opt :role) string?
   (ds/opt :type) string?
   (ds/opt :user) string?
   })

(def v1-se-linux-options
  (ds/spec
    {:name ::v1-se-linux-options
     :spec v1-se-linux-options-data}))

