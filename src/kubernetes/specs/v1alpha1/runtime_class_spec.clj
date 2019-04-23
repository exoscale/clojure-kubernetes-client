(ns kubernetes.specs.v1alpha1/runtime-class-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1alpha1/runtime-class-spec-data
  {
   (ds/req :runtimeHandler) string?
   })

(def v1alpha1/runtime-class-spec-spec
  (ds/spec
    {:name ::v1alpha1/runtime-class-spec
     :spec v1alpha1/runtime-class-spec-data}))
