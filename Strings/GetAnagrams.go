package main

import (
	"fmt"
	"sort"
)

func main() {
	words := []string{"cat", "act", "allot", "peach", "cheap", "dusty"}
	queries := []string{"study", "peahc", "tac"}
	fmt.Println(getAna(words, queries))
}

//words array - ["cat","act","allot","peach","cheap","dusty"]
//queries array - ["study","peahc","tac"]
//Output - [["dusty"],["cheap","peach"],["act","cat"]]

func getAna(words, queries []string) [][]string {
	out := [][]string{}
	m := map[string][]string{}
	for i := range words {
		w := sortStr(words[i])

		if _, ok := m[w]; !ok {
			m[w] = []string{words[i]}
		} else {
			m[w] = append(m[w], words[i])
		}
	}

	for i := range queries {
		q := sortStr(queries[i])
		if _, ok := m[q]; ok {
			sort.Strings(m[q])
			out = append(out, m[q])
		}

	}
	return out
}

func sortStr(w string) string {
	runes := []rune(w)

	sort.Slice(runes, func(i, j int) bool {
		return runes[i] < runes[j]
	})

	return string(runes)
}
