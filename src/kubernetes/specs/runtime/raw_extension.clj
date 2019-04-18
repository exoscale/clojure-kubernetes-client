(ns kubernetes.specs.runtime/raw-extension
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def runtime/raw-extension-data
  {
   (ds/req :Raw) any?
   })

(def runtime/raw-extension-spec
  (ds/spec
    {:name ::runtime/raw-extension
     :spec runtime/raw-extension-data}))
