(ns kubernetes.specs.v1/watch-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.runtime/raw-extension :refer :all]
            )
  (:import (java.io File)))


(def v1/watch-event-data
  {
   (ds/req :object) runtime/raw-extension-spec
   (ds/req :type) string?
   })

(def v1/watch-event-spec
  (ds/spec
    {:name ::v1/watch-event
     :spec v1/watch-event-data}))
