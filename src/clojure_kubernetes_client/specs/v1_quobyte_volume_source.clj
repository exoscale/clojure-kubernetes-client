(ns clojure-kubernetes-client.specs.v1-quobyte-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-quobyte-volume-source-data v1-quobyte-volume-source)
(def v1-quobyte-volume-source-data
  {
   (ds/opt :group) string?
   (ds/opt :readOnly) boolean?
   (ds/req :registry) string?
   (ds/opt :tenant) string?
   (ds/opt :user) string?
   (ds/req :volume) string?
   })

(def v1-quobyte-volume-source
  (ds/spec
    {:name ::v1-quobyte-volume-source
     :spec v1-quobyte-volume-source-data}))

