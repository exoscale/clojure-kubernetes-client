(ns kubernetes.specs.v1alpha1/pod-preset-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/env-var :refer :all]
            [kubernetes.specs.v1/env-from-source :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1/volume-mount :refer :all]
            [kubernetes.specs.v1/volume :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/pod-preset-spec-data
  {
   (ds/opt :env) (s/coll-of v1/env-var-spec)
   (ds/opt :envFrom) (s/coll-of v1/env-from-source-spec)
   (ds/opt :selector) v1/label-selector-spec
   (ds/opt :volumeMounts) (s/coll-of v1/volume-mount-spec)
   (ds/opt :volumes) (s/coll-of v1/volume-spec)
   })

(def v1alpha1/pod-preset-spec-spec
  (ds/spec
    {:name ::v1alpha1/pod-preset-spec
     :spec v1alpha1/pod-preset-spec-data}))
