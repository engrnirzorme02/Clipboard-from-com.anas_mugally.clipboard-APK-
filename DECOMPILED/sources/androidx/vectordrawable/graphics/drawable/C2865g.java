package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.collection.C2390a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p025D.AbstractC0165h;
import p025D.AbstractC0168k;
import p025D.C0161d;
import p033E.AbstractC0249d;
import p041F.AbstractC0400a;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g */
/* JADX INFO: loaded from: classes.dex */
public class C2865g extends AbstractC2864f {

    /* JADX INFO: renamed from: v */
    static final PorterDuff.Mode f11609v = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    private h f11610b;

    /* JADX INFO: renamed from: c */
    private PorterDuffColorFilter f11611c;

    /* JADX INFO: renamed from: d */
    private ColorFilter f11612d;

    /* JADX INFO: renamed from: e */
    private boolean f11613e;

    /* JADX INFO: renamed from: f */
    private boolean f11614f;

    /* JADX INFO: renamed from: r */
    private Drawable.ConstantState f11615r;

    /* JADX INFO: renamed from: s */
    private final float[] f11616s;

    /* JADX INFO: renamed from: t */
    private final Matrix f11617t;

    /* JADX INFO: renamed from: u */
    private final Rect f11618u;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$b */
    private static class b extends f {
        b() {
        }

        /* JADX INFO: renamed from: f */
        private void m14247f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11645b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f11644a = AbstractC0249d.m1194d(string2);
            }
            this.f11646c = AbstractC0168k.m846k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2865g.f
        /* JADX INFO: renamed from: c */
        public boolean mo14248c() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public void m14249e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (AbstractC0168k.m851p(xmlPullParser, "pathData")) {
                TypedArray typedArrayM852q = AbstractC0168k.m852q(resources, theme, attributeSet, AbstractC2859a.f11582d);
                m14247f(typedArrayM852q, xmlPullParser);
                typedArrayM852q.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$e */
    private static abstract class e {
        private e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo14253a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo14254b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$h */
    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        int f11665a;

        /* JADX INFO: renamed from: b */
        g f11666b;

        /* JADX INFO: renamed from: c */
        ColorStateList f11667c;

        /* JADX INFO: renamed from: d */
        PorterDuff.Mode f11668d;

        /* JADX INFO: renamed from: e */
        boolean f11669e;

        /* JADX INFO: renamed from: f */
        Bitmap f11670f;

        /* JADX INFO: renamed from: g */
        ColorStateList f11671g;

        /* JADX INFO: renamed from: h */
        PorterDuff.Mode f11672h;

        /* JADX INFO: renamed from: i */
        int f11673i;

        /* JADX INFO: renamed from: j */
        boolean f11674j;

        /* JADX INFO: renamed from: k */
        boolean f11675k;

        /* JADX INFO: renamed from: l */
        Paint f11676l;

        public h(h hVar) {
            this.f11667c = null;
            this.f11668d = C2865g.f11609v;
            if (hVar != null) {
                this.f11665a = hVar.f11665a;
                g gVar = new g(hVar.f11666b);
                this.f11666b = gVar;
                if (hVar.f11666b.f11653e != null) {
                    gVar.f11653e = new Paint(hVar.f11666b.f11653e);
                }
                if (hVar.f11666b.f11652d != null) {
                    this.f11666b.f11652d = new Paint(hVar.f11666b.f11652d);
                }
                this.f11667c = hVar.f11667c;
                this.f11668d = hVar.f11668d;
                this.f11669e = hVar.f11669e;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m14267a(int i7, int i8) {
            return i7 == this.f11670f.getWidth() && i8 == this.f11670f.getHeight();
        }

        /* JADX INFO: renamed from: b */
        public boolean m14268b() {
            return !this.f11675k && this.f11671g == this.f11667c && this.f11672h == this.f11668d && this.f11674j == this.f11669e && this.f11673i == this.f11666b.getRootAlpha();
        }

        /* JADX INFO: renamed from: c */
        public void m14269c(int i7, int i8) {
            if (this.f11670f == null || !m14267a(i7, i8)) {
                this.f11670f = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                this.f11675k = true;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m14270d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f11670f, (Rect) null, rect, m14271e(colorFilter));
        }

        /* JADX INFO: renamed from: e */
        public Paint m14271e(ColorFilter colorFilter) {
            if (!m14272f() && colorFilter == null) {
                return null;
            }
            if (this.f11676l == null) {
                Paint paint = new Paint();
                this.f11676l = paint;
                paint.setFilterBitmap(true);
            }
            this.f11676l.setAlpha(this.f11666b.getRootAlpha());
            this.f11676l.setColorFilter(colorFilter);
            return this.f11676l;
        }

        /* JADX INFO: renamed from: f */
        public boolean m14272f() {
            return this.f11666b.getRootAlpha() < 255;
        }

        /* JADX INFO: renamed from: g */
        public boolean m14273g() {
            return this.f11666b.m14265f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11665a;
        }

        /* JADX INFO: renamed from: h */
        public boolean m14274h(int[] iArr) {
            boolean zM14266g = this.f11666b.m14266g(iArr);
            this.f11675k |= zM14266g;
            return zM14266g;
        }

        /* JADX INFO: renamed from: i */
        public void m14275i() {
            this.f11671g = this.f11667c;
            this.f11672h = this.f11668d;
            this.f11673i = this.f11666b.getRootAlpha();
            this.f11674j = this.f11669e;
            this.f11675k = false;
        }

        /* JADX INFO: renamed from: j */
        public void m14276j(int i7, int i8) {
            this.f11670f.eraseColor(0);
            this.f11666b.m14264b(new Canvas(this.f11670f), i7, i8, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C2865g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C2865g(this);
        }

        public h() {
            this.f11667c = null;
            this.f11668d = C2865g.f11609v;
            this.f11666b = new g();
        }
    }

    C2865g() {
        this.f11614f = true;
        this.f11616s = new float[9];
        this.f11617t = new Matrix();
        this.f11618u = new Rect();
        this.f11610b = new h();
    }

    /* JADX INFO: renamed from: a */
    static int m14238a(int i7, float f7) {
        return (i7 & 16777215) | (((int) (Color.alpha(i7) * f7)) << 24);
    }

    /* JADX INFO: renamed from: b */
    public static C2865g m14239b(Resources resources, int i7, Resources.Theme theme) {
        C2865g c2865g = new C2865g();
        c2865g.f11608a = AbstractC0165h.m813e(resources, i7, theme);
        c2865g.f11615r = new i(c2865g.f11608a.getConstantState());
        return c2865g;
    }

    /* JADX INFO: renamed from: d */
    private void m14240d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f11610b;
        g gVar = hVar.f11666b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f11656h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z7 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m14255g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11632b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f11664p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f11665a = cVar.f11647d | hVar.f11665a;
                    z7 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m14249e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11632b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f11664p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f11665a = bVar.f11647d | hVar.f11665a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m14258c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11632b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f11664p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f11665a = dVar2.f11641k | hVar.f11665a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z7) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m14241e() {
        return isAutoMirrored() && AbstractC0400a.m1700f(this) == 1;
    }

    /* JADX INFO: renamed from: f */
    private static PorterDuff.Mode m14242f(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m14243h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f11610b;
        g gVar = hVar.f11666b;
        hVar.f11668d = m14242f(AbstractC0168k.m846k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM842g = AbstractC0168k.m842g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM842g != null) {
            hVar.f11667c = colorStateListM842g;
        }
        hVar.f11669e = AbstractC0168k.m840e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f11669e);
        gVar.f11659k = AbstractC0168k.m845j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f11659k);
        float fM845j = AbstractC0168k.m845j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f11660l);
        gVar.f11660l = fM845j;
        if (gVar.f11659k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM845j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f11657i = typedArray.getDimension(3, gVar.f11657i);
        float dimension = typedArray.getDimension(2, gVar.f11658j);
        gVar.f11658j = dimension;
        if (gVar.f11657i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(AbstractC0168k.m845j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f11662n = string;
            gVar.f11664p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* JADX INFO: renamed from: c */
    Object m14244c(String str) {
        return this.f11610b.f11666b.f11664p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11608a;
        if (drawable == null) {
            return false;
        }
        AbstractC0400a.m1696b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f11618u);
        if (this.f11618u.width() <= 0 || this.f11618u.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11612d;
        if (colorFilter == null) {
            colorFilter = this.f11611c;
        }
        canvas.getMatrix(this.f11617t);
        this.f11617t.getValues(this.f11616s);
        float fAbs = Math.abs(this.f11616s[0]);
        float fAbs2 = Math.abs(this.f11616s[4]);
        float fAbs3 = Math.abs(this.f11616s[1]);
        float fAbs4 = Math.abs(this.f11616s[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f11618u.width() * fAbs);
        int iHeight = (int) (this.f11618u.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f11618u;
        canvas.translate(rect.left, rect.top);
        if (m14241e()) {
            canvas.translate(this.f11618u.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f11618u.offsetTo(0, 0);
        this.f11610b.m14269c(iMin, iMin2);
        if (!this.f11614f) {
            this.f11610b.m14276j(iMin, iMin2);
        } else if (!this.f11610b.m14268b()) {
            this.f11610b.m14276j(iMin, iMin2);
            this.f11610b.m14275i();
        }
        this.f11610b.m14270d(canvas, colorFilter, this.f11618u);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: g */
    void m14245g(boolean z7) {
        this.f11614f = z7;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11608a;
        return drawable != null ? AbstractC0400a.m1698d(drawable) : this.f11610b.f11666b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11610b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11608a;
        return drawable != null ? AbstractC0400a.m1699e(drawable) : this.f11612d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11608a != null) {
            return new i(this.f11608a.getConstantState());
        }
        this.f11610b.f11665a = getChangingConfigurations();
        return this.f11610b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11610b.f11666b.f11658j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11610b.f11666b.f11657i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: renamed from: i */
    PorterDuffColorFilter m14246i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11608a;
        return drawable != null ? AbstractC0400a.m1702h(drawable) : this.f11610b.f11669e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f11610b;
        if (hVar == null) {
            return false;
        }
        if (hVar.m14273g()) {
            return true;
        }
        ColorStateList colorStateList = this.f11610b.f11667c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11613e && super.mutate() == this) {
            this.f11610b = new h(this.f11610b);
            this.f11613e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f11610b;
        ColorStateList colorStateList = hVar.f11667c;
        if (colorStateList == null || (mode = hVar.f11668d) == null) {
            z7 = false;
        } else {
            this.f11611c = m14246i(this.f11611c, colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        if (!hVar.m14273g() || !hVar.m14274h(iArr)) {
            return z7;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f11610b.f11666b.getRootAlpha() != i7) {
            this.f11610b.f11666b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1704j(drawable, z7);
        } else {
            this.f11610b.f11669e = z7;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1708n(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1709o(drawable, colorStateList);
            return;
        }
        h hVar = this.f11610b;
        if (hVar.f11667c != colorStateList) {
            hVar.f11667c = colorStateList;
            this.f11611c = m14246i(this.f11611c, colorStateList, hVar.f11668d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1710p(drawable, mode);
            return;
        }
        h hVar = this.f11610b;
        if (hVar.f11668d != mode) {
            hVar.f11668d = mode;
            this.f11611c = m14246i(this.f11611c, hVar.f11667c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.setVisible(z7, z8) : super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$i */
    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        private final Drawable.ConstantState f11677a;

        public i(Drawable.ConstantState constantState) {
            this.f11677a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11677a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11677a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2865g c2865g = new C2865g();
            c2865g.f11608a = (VectorDrawable) this.f11677a.newDrawable();
            return c2865g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C2865g c2865g = new C2865g();
            c2865g.f11608a = (VectorDrawable) this.f11677a.newDrawable(resources);
            return c2865g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2865g c2865g = new C2865g();
            c2865g.f11608a = (VectorDrawable) this.f11677a.newDrawable(resources, theme);
            return c2865g;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11612d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$f */
    private static abstract class f extends e {

        /* JADX INFO: renamed from: a */
        protected AbstractC0249d.b[] f11644a;

        /* JADX INFO: renamed from: b */
        String f11645b;

        /* JADX INFO: renamed from: c */
        int f11646c;

        /* JADX INFO: renamed from: d */
        int f11647d;

        public f() {
            super();
            this.f11644a = null;
            this.f11646c = 0;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo14248c() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m14259d(Path path) {
            path.reset();
            AbstractC0249d.b[] bVarArr = this.f11644a;
            if (bVarArr != null) {
                AbstractC0249d.b.m1209h(bVarArr, path);
            }
        }

        public AbstractC0249d.b[] getPathData() {
            return this.f11644a;
        }

        public String getPathName() {
            return this.f11645b;
        }

        public void setPathData(AbstractC0249d.b[] bVarArr) {
            if (AbstractC0249d.m1192b(this.f11644a, bVarArr)) {
                AbstractC0249d.m1201k(this.f11644a, bVarArr);
            } else {
                this.f11644a = AbstractC0249d.m1196f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f11644a = null;
            this.f11646c = 0;
            this.f11645b = fVar.f11645b;
            this.f11647d = fVar.f11647d;
            this.f11644a = AbstractC0249d.m1196f(fVar.f11644a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1701g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f11610b;
        hVar.f11666b = new g();
        TypedArray typedArrayM852q = AbstractC0168k.m852q(resources, theme, attributeSet, AbstractC2859a.f11579a);
        m14243h(typedArrayM852q, xmlPullParser, theme);
        typedArrayM852q.recycle();
        hVar.f11665a = getChangingConfigurations();
        hVar.f11675k = true;
        m14240d(resources, xmlPullParser, attributeSet, theme);
        this.f11611c = m14246i(this.f11611c, hVar.f11667c, hVar.f11668d);
    }

    C2865g(h hVar) {
        this.f11614f = true;
        this.f11616s = new float[9];
        this.f11617t = new Matrix();
        this.f11618u = new Rect();
        this.f11610b = hVar;
        this.f11611c = m14246i(this.f11611c, hVar.f11667c, hVar.f11668d);
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$c */
    private static class c extends f {

        /* JADX INFO: renamed from: e */
        private int[] f11619e;

        /* JADX INFO: renamed from: f */
        C0161d f11620f;

        /* JADX INFO: renamed from: g */
        float f11621g;

        /* JADX INFO: renamed from: h */
        C0161d f11622h;

        /* JADX INFO: renamed from: i */
        float f11623i;

        /* JADX INFO: renamed from: j */
        float f11624j;

        /* JADX INFO: renamed from: k */
        float f11625k;

        /* JADX INFO: renamed from: l */
        float f11626l;

        /* JADX INFO: renamed from: m */
        float f11627m;

        /* JADX INFO: renamed from: n */
        Paint.Cap f11628n;

        /* JADX INFO: renamed from: o */
        Paint.Join f11629o;

        /* JADX INFO: renamed from: p */
        float f11630p;

        c() {
            this.f11621g = 0.0f;
            this.f11623i = 1.0f;
            this.f11624j = 1.0f;
            this.f11625k = 0.0f;
            this.f11626l = 1.0f;
            this.f11627m = 0.0f;
            this.f11628n = Paint.Cap.BUTT;
            this.f11629o = Paint.Join.MITER;
            this.f11630p = 4.0f;
        }

        /* JADX INFO: renamed from: e */
        private Paint.Cap m14250e(int i7, Paint.Cap cap) {
            if (i7 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i7 != 1) {
                return i7 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* JADX INFO: renamed from: f */
        private Paint.Join m14251f(int i7, Paint.Join join) {
            if (i7 == 0) {
                return Paint.Join.MITER;
            }
            if (i7 != 1) {
                return i7 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* JADX INFO: renamed from: h */
        private void m14252h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f11619e = null;
            if (AbstractC0168k.m851p(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f11645b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f11644a = AbstractC0249d.m1194d(string2);
                }
                this.f11622h = AbstractC0168k.m844i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f11624j = AbstractC0168k.m845j(typedArray, xmlPullParser, "fillAlpha", 12, this.f11624j);
                this.f11628n = m14250e(AbstractC0168k.m846k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f11628n);
                this.f11629o = m14251f(AbstractC0168k.m846k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f11629o);
                this.f11630p = AbstractC0168k.m845j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f11630p);
                this.f11620f = AbstractC0168k.m844i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f11623i = AbstractC0168k.m845j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f11623i);
                this.f11621g = AbstractC0168k.m845j(typedArray, xmlPullParser, "strokeWidth", 4, this.f11621g);
                this.f11626l = AbstractC0168k.m845j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f11626l);
                this.f11627m = AbstractC0168k.m845j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f11627m);
                this.f11625k = AbstractC0168k.m845j(typedArray, xmlPullParser, "trimPathStart", 5, this.f11625k);
                this.f11646c = AbstractC0168k.m846k(typedArray, xmlPullParser, "fillType", 13, this.f11646c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2865g.e
        /* JADX INFO: renamed from: a */
        public boolean mo14253a() {
            return this.f11622h.m777i() || this.f11620f.m777i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2865g.e
        /* JADX INFO: renamed from: b */
        public boolean mo14254b(int[] iArr) {
            return this.f11620f.m778j(iArr) | this.f11622h.m778j(iArr);
        }

        /* JADX INFO: renamed from: g */
        public void m14255g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM852q = AbstractC0168k.m852q(resources, theme, attributeSet, AbstractC2859a.f11581c);
            m14252h(typedArrayM852q, xmlPullParser, theme);
            typedArrayM852q.recycle();
        }

        float getFillAlpha() {
            return this.f11624j;
        }

        int getFillColor() {
            return this.f11622h.m774e();
        }

        float getStrokeAlpha() {
            return this.f11623i;
        }

        int getStrokeColor() {
            return this.f11620f.m774e();
        }

        float getStrokeWidth() {
            return this.f11621g;
        }

        float getTrimPathEnd() {
            return this.f11626l;
        }

        float getTrimPathOffset() {
            return this.f11627m;
        }

        float getTrimPathStart() {
            return this.f11625k;
        }

        void setFillAlpha(float f7) {
            this.f11624j = f7;
        }

        void setFillColor(int i7) {
            this.f11622h.m779k(i7);
        }

        void setStrokeAlpha(float f7) {
            this.f11623i = f7;
        }

        void setStrokeColor(int i7) {
            this.f11620f.m779k(i7);
        }

        void setStrokeWidth(float f7) {
            this.f11621g = f7;
        }

        void setTrimPathEnd(float f7) {
            this.f11626l = f7;
        }

        void setTrimPathOffset(float f7) {
            this.f11627m = f7;
        }

        void setTrimPathStart(float f7) {
            this.f11625k = f7;
        }

        c(c cVar) {
            super(cVar);
            this.f11621g = 0.0f;
            this.f11623i = 1.0f;
            this.f11624j = 1.0f;
            this.f11625k = 0.0f;
            this.f11626l = 1.0f;
            this.f11627m = 0.0f;
            this.f11628n = Paint.Cap.BUTT;
            this.f11629o = Paint.Join.MITER;
            this.f11630p = 4.0f;
            this.f11619e = cVar.f11619e;
            this.f11620f = cVar.f11620f;
            this.f11621g = cVar.f11621g;
            this.f11623i = cVar.f11623i;
            this.f11622h = cVar.f11622h;
            this.f11646c = cVar.f11646c;
            this.f11624j = cVar.f11624j;
            this.f11625k = cVar.f11625k;
            this.f11626l = cVar.f11626l;
            this.f11627m = cVar.f11627m;
            this.f11628n = cVar.f11628n;
            this.f11629o = cVar.f11629o;
            this.f11630p = cVar.f11630p;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$g */
    private static class g {

        /* JADX INFO: renamed from: q */
        private static final Matrix f11648q = new Matrix();

        /* JADX INFO: renamed from: a */
        private final Path f11649a;

        /* JADX INFO: renamed from: b */
        private final Path f11650b;

        /* JADX INFO: renamed from: c */
        private final Matrix f11651c;

        /* JADX INFO: renamed from: d */
        Paint f11652d;

        /* JADX INFO: renamed from: e */
        Paint f11653e;

        /* JADX INFO: renamed from: f */
        private PathMeasure f11654f;

        /* JADX INFO: renamed from: g */
        private int f11655g;

        /* JADX INFO: renamed from: h */
        final d f11656h;

        /* JADX INFO: renamed from: i */
        float f11657i;

        /* JADX INFO: renamed from: j */
        float f11658j;

        /* JADX INFO: renamed from: k */
        float f11659k;

        /* JADX INFO: renamed from: l */
        float f11660l;

        /* JADX INFO: renamed from: m */
        int f11661m;

        /* JADX INFO: renamed from: n */
        String f11662n;

        /* JADX INFO: renamed from: o */
        Boolean f11663o;

        /* JADX INFO: renamed from: p */
        final C2390a f11664p;

        public g() {
            this.f11651c = new Matrix();
            this.f11657i = 0.0f;
            this.f11658j = 0.0f;
            this.f11659k = 0.0f;
            this.f11660l = 0.0f;
            this.f11661m = 255;
            this.f11662n = null;
            this.f11663o = null;
            this.f11664p = new C2390a();
            this.f11656h = new d();
            this.f11649a = new Path();
            this.f11650b = new Path();
        }

        /* JADX INFO: renamed from: a */
        private static float m14260a(float f7, float f8, float f9, float f10) {
            return (f7 * f10) - (f8 * f9);
        }

        /* JADX INFO: renamed from: c */
        private void m14261c(d dVar, Matrix matrix, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f11631a.set(matrix);
            dVar2.f11631a.preConcat(dVar2.f11640j);
            canvas.save();
            int i9 = 0;
            while (i9 < dVar2.f11632b.size()) {
                e eVar = (e) dVar2.f11632b.get(i9);
                if (eVar instanceof d) {
                    m14261c((d) eVar, dVar2.f11631a, canvas, i7, i8, colorFilter);
                } else if (eVar instanceof f) {
                    m14262d(dVar2, (f) eVar, canvas, i7, i8, colorFilter);
                }
                i9++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        /* JADX INFO: renamed from: d */
        private void m14262d(d dVar, f fVar, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            float f7 = i7 / this.f11659k;
            float f8 = i8 / this.f11660l;
            float fMin = Math.min(f7, f8);
            Matrix matrix = dVar.f11631a;
            this.f11651c.set(matrix);
            this.f11651c.postScale(f7, f8);
            float fM14263e = m14263e(matrix);
            if (fM14263e == 0.0f) {
                return;
            }
            fVar.m14259d(this.f11649a);
            Path path = this.f11649a;
            this.f11650b.reset();
            if (fVar.mo14248c()) {
                this.f11650b.setFillType(fVar.f11646c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f11650b.addPath(path, this.f11651c);
                canvas.clipPath(this.f11650b);
                return;
            }
            c cVar = (c) fVar;
            float f9 = cVar.f11625k;
            if (f9 != 0.0f || cVar.f11626l != 1.0f) {
                float f10 = cVar.f11627m;
                float f11 = (f9 + f10) % 1.0f;
                float f12 = (cVar.f11626l + f10) % 1.0f;
                if (this.f11654f == null) {
                    this.f11654f = new PathMeasure();
                }
                this.f11654f.setPath(this.f11649a, false);
                float length = this.f11654f.getLength();
                float f13 = f11 * length;
                float f14 = f12 * length;
                path.reset();
                if (f13 > f14) {
                    this.f11654f.getSegment(f13, length, path, true);
                    this.f11654f.getSegment(0.0f, f14, path, true);
                } else {
                    this.f11654f.getSegment(f13, f14, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f11650b.addPath(path, this.f11651c);
            if (cVar.f11622h.m780l()) {
                C0161d c0161d = cVar.f11622h;
                if (this.f11653e == null) {
                    Paint paint = new Paint(1);
                    this.f11653e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f11653e;
                if (c0161d.m776h()) {
                    Shader shaderM775f = c0161d.m775f();
                    shaderM775f.setLocalMatrix(this.f11651c);
                    paint2.setShader(shaderM775f);
                    paint2.setAlpha(Math.round(cVar.f11624j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C2865g.m14238a(c0161d.m774e(), cVar.f11624j));
                }
                paint2.setColorFilter(colorFilter);
                this.f11650b.setFillType(cVar.f11646c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f11650b, paint2);
            }
            if (cVar.f11620f.m780l()) {
                C0161d c0161d2 = cVar.f11620f;
                if (this.f11652d == null) {
                    Paint paint3 = new Paint(1);
                    this.f11652d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f11652d;
                Paint.Join join = cVar.f11629o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f11628n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f11630p);
                if (c0161d2.m776h()) {
                    Shader shaderM775f2 = c0161d2.m775f();
                    shaderM775f2.setLocalMatrix(this.f11651c);
                    paint4.setShader(shaderM775f2);
                    paint4.setAlpha(Math.round(cVar.f11623i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C2865g.m14238a(c0161d2.m774e(), cVar.f11623i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f11621g * fMin * fM14263e);
                canvas.drawPath(this.f11650b, paint4);
            }
        }

        /* JADX INFO: renamed from: e */
        private float m14263e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM14260a = m14260a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM14260a) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: b */
        public void m14264b(Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            m14261c(this.f11656h, f11648q, canvas, i7, i8, colorFilter);
        }

        /* JADX INFO: renamed from: f */
        public boolean m14265f() {
            if (this.f11663o == null) {
                this.f11663o = Boolean.valueOf(this.f11656h.mo14253a());
            }
            return this.f11663o.booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public boolean m14266g(int[] iArr) {
            return this.f11656h.mo14254b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11661m;
        }

        public void setAlpha(float f7) {
            setRootAlpha((int) (f7 * 255.0f));
        }

        public void setRootAlpha(int i7) {
            this.f11661m = i7;
        }

        public g(g gVar) {
            this.f11651c = new Matrix();
            this.f11657i = 0.0f;
            this.f11658j = 0.0f;
            this.f11659k = 0.0f;
            this.f11660l = 0.0f;
            this.f11661m = 255;
            this.f11662n = null;
            this.f11663o = null;
            C2390a c2390a = new C2390a();
            this.f11664p = c2390a;
            this.f11656h = new d(gVar.f11656h, c2390a);
            this.f11649a = new Path(gVar.f11649a);
            this.f11650b = new Path(gVar.f11650b);
            this.f11657i = gVar.f11657i;
            this.f11658j = gVar.f11658j;
            this.f11659k = gVar.f11659k;
            this.f11660l = gVar.f11660l;
            this.f11655g = gVar.f11655g;
            this.f11661m = gVar.f11661m;
            this.f11662n = gVar.f11662n;
            String str = gVar.f11662n;
            if (str != null) {
                c2390a.put(str, this);
            }
            this.f11663o = gVar.f11663o;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$d */
    private static class d extends e {

        /* JADX INFO: renamed from: a */
        final Matrix f11631a;

        /* JADX INFO: renamed from: b */
        final ArrayList f11632b;

        /* JADX INFO: renamed from: c */
        float f11633c;

        /* JADX INFO: renamed from: d */
        private float f11634d;

        /* JADX INFO: renamed from: e */
        private float f11635e;

        /* JADX INFO: renamed from: f */
        private float f11636f;

        /* JADX INFO: renamed from: g */
        private float f11637g;

        /* JADX INFO: renamed from: h */
        private float f11638h;

        /* JADX INFO: renamed from: i */
        private float f11639i;

        /* JADX INFO: renamed from: j */
        final Matrix f11640j;

        /* JADX INFO: renamed from: k */
        int f11641k;

        /* JADX INFO: renamed from: l */
        private int[] f11642l;

        /* JADX INFO: renamed from: m */
        private String f11643m;

        public d(d dVar, C2390a c2390a) {
            f bVar;
            super();
            this.f11631a = new Matrix();
            this.f11632b = new ArrayList();
            this.f11633c = 0.0f;
            this.f11634d = 0.0f;
            this.f11635e = 0.0f;
            this.f11636f = 1.0f;
            this.f11637g = 1.0f;
            this.f11638h = 0.0f;
            this.f11639i = 0.0f;
            Matrix matrix = new Matrix();
            this.f11640j = matrix;
            this.f11643m = null;
            this.f11633c = dVar.f11633c;
            this.f11634d = dVar.f11634d;
            this.f11635e = dVar.f11635e;
            this.f11636f = dVar.f11636f;
            this.f11637g = dVar.f11637g;
            this.f11638h = dVar.f11638h;
            this.f11639i = dVar.f11639i;
            this.f11642l = dVar.f11642l;
            String str = dVar.f11643m;
            this.f11643m = str;
            this.f11641k = dVar.f11641k;
            if (str != null) {
                c2390a.put(str, this);
            }
            matrix.set(dVar.f11640j);
            ArrayList arrayList = dVar.f11632b;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof d) {
                    this.f11632b.add(new d((d) obj, c2390a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f11632b.add(bVar);
                    Object obj2 = bVar.f11645b;
                    if (obj2 != null) {
                        c2390a.put(obj2, bVar);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        private void m14256d() {
            this.f11640j.reset();
            this.f11640j.postTranslate(-this.f11634d, -this.f11635e);
            this.f11640j.postScale(this.f11636f, this.f11637g);
            this.f11640j.postRotate(this.f11633c, 0.0f, 0.0f);
            this.f11640j.postTranslate(this.f11638h + this.f11634d, this.f11639i + this.f11635e);
        }

        /* JADX INFO: renamed from: e */
        private void m14257e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f11642l = null;
            this.f11633c = AbstractC0168k.m845j(typedArray, xmlPullParser, "rotation", 5, this.f11633c);
            this.f11634d = typedArray.getFloat(1, this.f11634d);
            this.f11635e = typedArray.getFloat(2, this.f11635e);
            this.f11636f = AbstractC0168k.m845j(typedArray, xmlPullParser, "scaleX", 3, this.f11636f);
            this.f11637g = AbstractC0168k.m845j(typedArray, xmlPullParser, "scaleY", 4, this.f11637g);
            this.f11638h = AbstractC0168k.m845j(typedArray, xmlPullParser, "translateX", 6, this.f11638h);
            this.f11639i = AbstractC0168k.m845j(typedArray, xmlPullParser, "translateY", 7, this.f11639i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11643m = string;
            }
            m14256d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2865g.e
        /* JADX INFO: renamed from: a */
        public boolean mo14253a() {
            for (int i7 = 0; i7 < this.f11632b.size(); i7++) {
                if (((e) this.f11632b.get(i7)).mo14253a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2865g.e
        /* JADX INFO: renamed from: b */
        public boolean mo14254b(int[] iArr) {
            boolean zMo14254b = false;
            for (int i7 = 0; i7 < this.f11632b.size(); i7++) {
                zMo14254b |= ((e) this.f11632b.get(i7)).mo14254b(iArr);
            }
            return zMo14254b;
        }

        /* JADX INFO: renamed from: c */
        public void m14258c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM852q = AbstractC0168k.m852q(resources, theme, attributeSet, AbstractC2859a.f11580b);
            m14257e(typedArrayM852q, xmlPullParser);
            typedArrayM852q.recycle();
        }

        public String getGroupName() {
            return this.f11643m;
        }

        public Matrix getLocalMatrix() {
            return this.f11640j;
        }

        public float getPivotX() {
            return this.f11634d;
        }

        public float getPivotY() {
            return this.f11635e;
        }

        public float getRotation() {
            return this.f11633c;
        }

        public float getScaleX() {
            return this.f11636f;
        }

        public float getScaleY() {
            return this.f11637g;
        }

        public float getTranslateX() {
            return this.f11638h;
        }

        public float getTranslateY() {
            return this.f11639i;
        }

        public void setPivotX(float f7) {
            if (f7 != this.f11634d) {
                this.f11634d = f7;
                m14256d();
            }
        }

        public void setPivotY(float f7) {
            if (f7 != this.f11635e) {
                this.f11635e = f7;
                m14256d();
            }
        }

        public void setRotation(float f7) {
            if (f7 != this.f11633c) {
                this.f11633c = f7;
                m14256d();
            }
        }

        public void setScaleX(float f7) {
            if (f7 != this.f11636f) {
                this.f11636f = f7;
                m14256d();
            }
        }

        public void setScaleY(float f7) {
            if (f7 != this.f11637g) {
                this.f11637g = f7;
                m14256d();
            }
        }

        public void setTranslateX(float f7) {
            if (f7 != this.f11638h) {
                this.f11638h = f7;
                m14256d();
            }
        }

        public void setTranslateY(float f7) {
            if (f7 != this.f11639i) {
                this.f11639i = f7;
                m14256d();
            }
        }

        public d() {
            super();
            this.f11631a = new Matrix();
            this.f11632b = new ArrayList();
            this.f11633c = 0.0f;
            this.f11634d = 0.0f;
            this.f11635e = 0.0f;
            this.f11636f = 1.0f;
            this.f11637g = 1.0f;
            this.f11638h = 0.0f;
            this.f11639i = 0.0f;
            this.f11640j = new Matrix();
            this.f11643m = null;
        }
    }
}
