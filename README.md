<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover">
<title>Alvin | My Portfolio</title>
<style>
:root{box-sizing:border-box;padding-top:env(safe-area-inset-top,0px);padding-bottom:env(safe-area-inset-bottom,0px);
--bg:#070b16;--card:#0f172a;--fg:#fff;--mut:#b6c7e3;--acc:#38bdf8;--acc2:#1d4ed8;--glow:#2563eb;--bd:#1d4ed8;--foot:#8aa4c8;color-scheme:dark}
html{scroll-padding-top:env(safe-area-inset-top,0px);scroll-behavior:smooth}
@media (prefers-color-scheme:light){:root:not([data-theme="dark"]){--bg:#f4f8ff;--card:#fff;--fg:#0f172a;--mut:#41557a;--acc:#1d4ed8;--acc2:#38bdf8;--glow:#93c5fd;--bd:#93c5fd;--foot:#5b7099;color-scheme:light}}
*{margin:0;padding:0;box-sizing:border-box}
body{background:var(--bg);color:var(--fg);font-family:Arial,sans-serif}
nav{display:flex;gap:25px;padding:20px 5%;flex-wrap:wrap}
nav a{color:var(--fg);text-decoration:none;font-size:17px;transition:.3s}
nav a:hover{color:var(--acc);text-shadow:0 0 10px var(--glow)}
.home{min-height:650px;padding:60px 5%;display:flex;align-items:center;justify-content:space-between;gap:40px}
.hero{max-width:52%}
.hero h1{font-size:55px;color:var(--acc);text-shadow:0 0 20px var(--glow);margin-bottom:15px}
.hero h2{font-size:25px;margin-bottom:15px}
.hero p{font-size:18px;line-height:1.6;color:var(--mut)}
.btn{display:inline-block;margin-top:25px;padding:12px 26px;border:2px solid var(--acc);border-radius:30px;color:var(--fg);text-decoration:none;transition:.3s}
.btn:hover{background:var(--acc);color:#071022;box-shadow:0 0 20px var(--glow)}
.profile{width:min(440px,100%);text-align:center}
.profile img{display:block;width:100%;height:540px;object-fit:cover;object-position:center 25%;background:var(--card);border:4px solid var(--acc);border-radius:18px;box-shadow:0 0 30px var(--glow)}
.profile p{font-size:20px;font-weight:bold;margin-top:15px}
section{padding:80px 8%;text-align:center}
section h2{font-size:35px;color:var(--acc);margin-bottom:25px;text-shadow:0 0 15px var(--glow)}
section>p{font-size:18px;line-height:1.7;color:var(--mut);max-width:760px;margin:0 auto}
.cards{display:flex;flex-wrap:wrap;justify-content:center;gap:25px;margin-top:30px}
.card{width:280px;min-height:160px;padding:25px;background:var(--card);border:2px solid var(--bd);border-radius:15px;box-shadow:0 0 15px var(--glow);transition:.3s;text-align:left}
.card:hover{transform:translateY(-8px);box-shadow:0 0 25px var(--acc)}
.card h3{color:var(--acc);margin-bottom:12px}
.card p{font-size:15px;line-height:1.5;color:var(--mut)}
.tag{display:inline-block;margin-top:14px;padding:3px 12px;font-size:13px;border:1px solid var(--acc);border-radius:20px;color:var(--acc)}
.card a{color:var(--acc);font-size:14px;text-decoration:none;display:inline-block;margin:14px 0 0 10px}
footer{text-align:center;padding:25px;color:var(--foot)}
@media (max-width:900px){
.home{min-height:auto;flex-direction:column-reverse;padding:40px 7%}
.hero{max-width:100%;text-align:center}.hero h1{font-size:38px}
.profile img{height:450px}section{padding:60px 6%}nav{justify-content:center}}
.card img{display:block;width:100%;border-radius:10px;margin-bottom:14px}
.card.c{text-align:center}.card.w{width:300px}
.chips{display:flex;flex-wrap:wrap;gap:10px;justify-content:center;margin-top:22px}
.chips span{padding:6px 16px;border:1px solid var(--acc);border-radius:20px;color:var(--acc);font-size:14px}
.pdfbtn{display:inline-block;margin-top:6px;padding:10px 22px;border:2px solid var(--acc);border-radius:30px;color:var(--fg);text-decoration:none;font-size:15px;transition:.3s}
.pdfbtn:hover{background:var(--acc);color:#071022;box-shadow:0 0 20px var(--glow)}
</style>
</head>
<body>
<nav><a href="#home">Home</a><a href="#about">About</a><a href="#myself">Myself</a><a href="#midterm">Midterm</a><a href="#final">Final</a></nav>

<div class="home" id="home">
<div class="hero">
<h1>BASTA MANYAMAN</h1>
<h2>Welcome to My Portfolio!</h2>
<p>I’m Alvin, a BS Information Technology student at NU Clark. Explore my learning journey, laboratory tasks, and the things I love outside the screen.</p>
<a class="btn" href="#midterm">View My Work</a>
</div>
<div class="profile"><img src="assets/vin2.jpg" alt="Alvin’s profile photo"><p>Alvin | BSIT Student</p></div>
</div>

<section id="about">
<h2>About Me</h2>
<p>I’m a student who enjoys exploring new things, learning different skills, and turning ideas into something meaningful. I believe that every experience is an opportunity to grow and improve.</p>
<div class="chips"><span>pogi</span><span>handsome</span><span>cool</span><span>gwapo</span></div>
</section>

<section id="myself">
<h2>Myself</h2>
<div class="cards">
<div class="card c w"><img src="assets/vin4.jpg" alt="🍳 Cooking"><h3>🍳 Cooking</h3><p>I enjoy cooking, experimenting with recipes, and trying different cuisines.</p></div>
<div class="card c w"><img src="assets/vin5.jpg" alt="🏐 Volleyball"><h3>🏐 Volleyball</h3><p>I enjoy the competition, teamwork, and constantly improving my volleyball skills.</p></div>
<div class="card c w"><img src="assets/vin6.jpg" alt="🏔️ Hiking"><h3>🏔️ Hiking</h3><p>Exploring nature, discovering new places, and enjoying the outdoors.</p></div>
<div class="card c w"><img src="assets/vin3.jpg" alt="🏃 Running"><h3>🏃 Running</h3><p>Staying active, challenging myself, and getting better every day.</p></div>
</div>
</section>

<section id="midterm">
<h2>Midterm Laboratory</h2>
<div class="cards">
<div class="card c w"><h3>Lab Task 1: Using 2 Dimensional Arrays</h3><img src="assets/lab1-preview.jpg" alt="Lab Task 1 PDF preview"><a class="pdfbtn" href="labs/midterm-lab1.pdf">📄 View Whole PDF →</a></div>
<div class="card c w"><h3>Lab Task 2: Using 3 Dimensional Arrays</h3><img src="assets/lab2-preview.jpg" alt="Lab Task 2 PDF preview"><a class="pdfbtn" href="labs/midterm-lab2.pdf">📄 View Whole PDF →</a></div>
</div>
</section>

<section id="final">
<h2>Final Laboratory</h2>
<div class="cards">
<div class="card c"><h3>Final Lab 1</h3><p>nyaman</p></div>
<div class="card c"><h3>Final Lab 2</h3><p>nyaman</p></div>
</div>
</section>

<footer>© 2026 Alvin | Do your best, and God will do the rest. 🙏</footer>
</body>
</html>
