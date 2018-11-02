var gulp = require('gulp'),concat=require('gulp-concat');


gulp.task('js', () => {
  return gulp.src([
    './node_modules/jquery/dist/jquery.min.js',
    './node_modules/jquery.scrollto/jquery.scrollTo.min.js',
  ])
    .pipe(concat('vendor.js'))
    .pipe(gulp.dest('static/js'));
});