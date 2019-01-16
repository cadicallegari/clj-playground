(ns clj-playground.core)

(defn do-nothing
    [x]
    x
)

(defn always-thing
    [& who]
    :thing
)

(defn make-thingy
  [x]
  (fn [& args] x)
)


(defn list-replication
  [n l]
  (mapcat (partial repeat n) l)
)
