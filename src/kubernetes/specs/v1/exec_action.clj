(ns kubernetes.specs.v1/exec-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/exec-action-data
  {
   (ds/opt :command) (s/coll-of string?)
   })

(def v1/exec-action-spec
  (ds/spec
    {:name ::v1/exec-action
     :spec v1/exec-action-data}))
