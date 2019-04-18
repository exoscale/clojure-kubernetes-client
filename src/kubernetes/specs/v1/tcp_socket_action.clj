(ns kubernetes.specs.v1/tcp-socket-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1/tcp-socket-action-data
  {
   (ds/opt :host) string?
   (ds/req :port) any?
   })

(def v1/tcp-socket-action-spec
  (ds/spec
    {:name ::v1/tcp-socket-action
     :spec v1/tcp-socket-action-data}))
