(ns clojure-kubernetes-client.specs.v1-event-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-event-source-data v1-event-source)
(def v1-event-source-data
  {
   (ds/opt :component) string?
   (ds/opt :host) string?
   })

(def v1-event-source
  (ds/spec
    {:name ::v1-event-source
     :spec v1-event-source-data}))

