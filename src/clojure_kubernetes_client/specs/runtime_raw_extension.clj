(ns clojure-kubernetes-client.specs.runtime-raw-extension
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare runtime-raw-extension-data runtime-raw-extension)
(def runtime-raw-extension-data
  {
   (ds/req :Raw) any?
   })

(def runtime-raw-extension
  (ds/spec
    {:name ::runtime-raw-extension
     :spec runtime-raw-extension-data}))

