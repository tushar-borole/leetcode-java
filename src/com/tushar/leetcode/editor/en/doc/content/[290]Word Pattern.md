<p>Given a <code>pattern</code> and a string <code>s</code>, find if <code>s</code>&nbsp;follows the same pattern.</p>

<p>Here <b>follow</b> means a full match, such that there is a bijection between a letter in <code>pattern</code> and a <b>non-empty</b> word in <code>s</code>. Specifically:</p>

<ul> 
 <li>Each letter in <code>pattern</code> maps to <strong>exactly</strong> one unique word in <code>s</code>.</li> 
 <li>Each unique word in <code>s</code> maps to <strong>exactly</strong> one letter in <code>pattern</code>.</li> 
 <li>No two letters map to the same word, and no two words map to the same letter.</li> 
</ul>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">pattern = "abba", s = "dog cat cat dog"</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>The bijection can be established as:</p>

<ul> 
 <li><code>'a'</code> maps to <code>"dog"</code>.</li> 
 <li><code>'b'</code> maps to <code>"cat"</code>.</li> 
</ul>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">pattern = "abba", s = "dog cat cat fish"</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">pattern = "aaaa", s = "dog cat cat dog"</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= pattern.length &lt;= 300</code></li> 
 <li><code>pattern</code> contains only lower-case English letters.</li> 
 <li><code>1 &lt;= s.length &lt;= 3000</code></li> 
 <li><code>s</code> contains only lowercase English letters and spaces <code>' '</code>.</li> 
 <li><code>s</code> <strong>does not contain</strong> any leading or trailing spaces.</li> 
 <li>All the words in <code>s</code> are separated by a <strong>single space</strong>.</li> 
</ul>

<div><details><summary>Related Topics</summary><div><li>Hash Table</li><li>String</li></div></details></div>
<div><li>👍 7590</li><li>👎 1091</li></div>