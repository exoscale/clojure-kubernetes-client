(ns kubernetes.specs.v1/event-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/event-source-data
  {
   (ds/opt :component) string?
   (ds/opt :host) string?
   })

(def v1/event-source-spec
  (ds/spec
    {:name ::v1/event-source
     :spec v1/event-source-data}))
