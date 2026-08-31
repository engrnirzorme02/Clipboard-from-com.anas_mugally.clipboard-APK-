package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p033E.AbstractC0246a;
import p255h.AbstractC5520a;
import p255h.AbstractC5522c;
import p255h.AbstractC5523d;
import p255h.AbstractC5524e;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2359j {

    /* JADX INFO: renamed from: b */
    private static final PorterDuff.Mode f8272b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    private static C2359j f8273c;

    /* JADX INFO: renamed from: a */
    private C2335V f8274a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.j$a */
    class a implements C2335V.c {

        /* JADX INFO: renamed from: a */
        private final int[] f8275a = {AbstractC5524e.f21020R, AbstractC5524e.f21018P, AbstractC5524e.f21022a};

        /* JADX INFO: renamed from: b */
        private final int[] f8276b = {AbstractC5524e.f21036o, AbstractC5524e.f21004B, AbstractC5524e.f21041t, AbstractC5524e.f21037p, AbstractC5524e.f21038q, AbstractC5524e.f21040s, AbstractC5524e.f21039r};

        /* JADX INFO: renamed from: c */
        private final int[] f8277c = {AbstractC5524e.f21017O, AbstractC5524e.f21019Q, AbstractC5524e.f21032k, AbstractC5524e.f21013K, AbstractC5524e.f21014L, AbstractC5524e.f21015M, AbstractC5524e.f21016N};

        /* JADX INFO: renamed from: d */
        private final int[] f8278d = {AbstractC5524e.f21044w, AbstractC5524e.f21030i, AbstractC5524e.f21043v};

        /* JADX INFO: renamed from: e */
        private final int[] f8279e = {AbstractC5524e.f21012J, AbstractC5524e.f21021S};

        /* JADX INFO: renamed from: f */
        private final int[] f8280f = {AbstractC5524e.f21024c, AbstractC5524e.f21028g, AbstractC5524e.f21025d, AbstractC5524e.f21029h};

        a() {
        }

        /* JADX INFO: renamed from: f */
        private boolean m10096f(int[] iArr, int i7) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        private ColorStateList m10097g(Context context) {
            return m10098h(context, 0);
        }

        /* JADX INFO: renamed from: h */
        private ColorStateList m10098h(Context context, int i7) {
            int iM9986c = AbstractC2340Z.m9986c(context, AbstractC5520a.f20982t);
            return new ColorStateList(new int[][]{AbstractC2340Z.f8154b, AbstractC2340Z.f8157e, AbstractC2340Z.f8155c, AbstractC2340Z.f8161i}, new int[]{AbstractC2340Z.m9985b(context, AbstractC5520a.f20980r), AbstractC0246a.m1178g(iM9986c, i7), AbstractC0246a.m1178g(iM9986c, i7), i7});
        }

        /* JADX INFO: renamed from: i */
        private ColorStateList m10099i(Context context) {
            return m10098h(context, AbstractC2340Z.m9986c(context, AbstractC5520a.f20979q));
        }

        /* JADX INFO: renamed from: j */
        private ColorStateList m10100j(Context context) {
            return m10098h(context, AbstractC2340Z.m9986c(context, AbstractC5520a.f20980r));
        }

        /* JADX INFO: renamed from: k */
        private ColorStateList m10101k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i7 = AbstractC5520a.f20986x;
            ColorStateList colorStateListM9988e = AbstractC2340Z.m9988e(context, i7);
            if (colorStateListM9988e == null || !colorStateListM9988e.isStateful()) {
                iArr[0] = AbstractC2340Z.f8154b;
                iArr2[0] = AbstractC2340Z.m9985b(context, i7);
                iArr[1] = AbstractC2340Z.f8158f;
                iArr2[1] = AbstractC2340Z.m9986c(context, AbstractC5520a.f20981s);
                iArr[2] = AbstractC2340Z.f8161i;
                iArr2[2] = AbstractC2340Z.m9986c(context, i7);
            } else {
                int[] iArr3 = AbstractC2340Z.f8154b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM9988e.getColorForState(iArr3, 0);
                iArr[1] = AbstractC2340Z.f8158f;
                iArr2[1] = AbstractC2340Z.m9986c(context, AbstractC5520a.f20981s);
                iArr[2] = AbstractC2340Z.f8161i;
                iArr2[2] = colorStateListM9988e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* JADX INFO: renamed from: l */
        private LayerDrawable m10102l(C2335V c2335v, Context context, int i7) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
            Drawable drawableM9958i = c2335v.m9958i(context, AbstractC5524e.f21008F);
            Drawable drawableM9958i2 = c2335v.m9958i(context, AbstractC5524e.f21009G);
            if ((drawableM9958i instanceof BitmapDrawable) && drawableM9958i.getIntrinsicWidth() == dimensionPixelSize && drawableM9958i.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM9958i;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM9958i.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM9958i.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM9958i2 instanceof BitmapDrawable) && drawableM9958i2.getIntrinsicWidth() == dimensionPixelSize && drawableM9958i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM9958i2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM9958i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM9958i2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: m */
        private void m10103m(Drawable drawable, int i7, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C2359j.f8272b;
            }
            drawableMutate.setColorFilter(C2359j.m10089e(i7, mode));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.C2335V.c
        /* JADX INFO: renamed from: a */
        public boolean mo9970a(Context context, int i7, Drawable drawable) {
            int i8;
            boolean z7;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = C2359j.f8272b;
            if (!m10096f(this.f8275a, i7)) {
                if (m10096f(this.f8277c, i7)) {
                    i8 = AbstractC5520a.f20981s;
                } else {
                    if (m10096f(this.f8278d, i7)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i7 == AbstractC5524e.f21042u) {
                            iRound = Math.round(40.8f);
                            i8 = 16842800;
                            mode = mode;
                        } else if (i7 != AbstractC5524e.f21033l) {
                            i8 = 0;
                            z7 = false;
                            iRound = -1;
                        }
                        z7 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i8 = 16842801;
                    z7 = true;
                }
                if (z7) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C2359j.m10089e(AbstractC2340Z.m9986c(context, i8), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i8 = AbstractC5520a.f20983u;
            z7 = true;
            iRound = -1;
            if (z7) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C2359j.m10089e(AbstractC2340Z.m9986c(context, i8), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.C2335V.c
        /* JADX INFO: renamed from: b */
        public PorterDuff.Mode mo9971b(int i7) {
            if (i7 == AbstractC5524e.f21010H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C2335V.c
        /* JADX INFO: renamed from: c */
        public Drawable mo9972c(C2335V c2335v, Context context, int i7) {
            if (i7 == AbstractC5524e.f21031j) {
                return new LayerDrawable(new Drawable[]{c2335v.m9958i(context, AbstractC5524e.f21030i), c2335v.m9958i(context, AbstractC5524e.f21032k)});
            }
            if (i7 == AbstractC5524e.f21046y) {
                return m10102l(c2335v, context, AbstractC5523d.f21000c);
            }
            if (i7 == AbstractC5524e.f21045x) {
                return m10102l(c2335v, context, AbstractC5523d.f21001d);
            }
            if (i7 == AbstractC5524e.f21047z) {
                return m10102l(c2335v, context, AbstractC5523d.f21002e);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C2335V.c
        /* JADX INFO: renamed from: d */
        public ColorStateList mo9973d(Context context, int i7) {
            if (i7 == AbstractC5524e.f21034m) {
                return AbstractC5659a.m25174a(context, AbstractC5522c.f20994e);
            }
            if (i7 == AbstractC5524e.f21011I) {
                return AbstractC5659a.m25174a(context, AbstractC5522c.f20997h);
            }
            if (i7 == AbstractC5524e.f21010H) {
                return m10101k(context);
            }
            if (i7 == AbstractC5524e.f21027f) {
                return m10100j(context);
            }
            if (i7 == AbstractC5524e.f21023b) {
                return m10097g(context);
            }
            if (i7 == AbstractC5524e.f21026e) {
                return m10099i(context);
            }
            if (i7 == AbstractC5524e.f21006D || i7 == AbstractC5524e.f21007E) {
                return AbstractC5659a.m25174a(context, AbstractC5522c.f20996g);
            }
            if (m10096f(this.f8276b, i7)) {
                return AbstractC2340Z.m9988e(context, AbstractC5520a.f20983u);
            }
            if (m10096f(this.f8279e, i7)) {
                return AbstractC5659a.m25174a(context, AbstractC5522c.f20993d);
            }
            if (m10096f(this.f8280f, i7)) {
                return AbstractC5659a.m25174a(context, AbstractC5522c.f20992c);
            }
            if (i7 == AbstractC5524e.f21003A) {
                return AbstractC5659a.m25174a(context, AbstractC5522c.f20995f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C2335V.c
        /* JADX INFO: renamed from: e */
        public boolean mo9974e(Context context, int i7, Drawable drawable) {
            if (i7 == AbstractC5524e.f21005C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i8 = AbstractC5520a.f20983u;
                m10103m(drawableFindDrawableByLayerId, AbstractC2340Z.m9986c(context, i8), C2359j.f8272b);
                m10103m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC2340Z.m9986c(context, i8), C2359j.f8272b);
                m10103m(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC2340Z.m9986c(context, AbstractC5520a.f20981s), C2359j.f8272b);
                return true;
            }
            if (i7 != AbstractC5524e.f21046y && i7 != AbstractC5524e.f21045x && i7 != AbstractC5524e.f21047z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m10103m(layerDrawable2.findDrawableByLayerId(R.id.background), AbstractC2340Z.m9985b(context, AbstractC5520a.f20983u), C2359j.f8272b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i9 = AbstractC5520a.f20981s;
            m10103m(drawableFindDrawableByLayerId2, AbstractC2340Z.m9986c(context, i9), C2359j.f8272b);
            m10103m(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC2340Z.m9986c(context, i9), C2359j.f8272b);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C2359j m10088b() {
        try {
            if (f8273c == null) {
                m10090h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8273c;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m10089e(int i7, PorterDuff.Mode mode) {
        return C2335V.m9951k(i7, mode);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m10090h() {
        if (f8273c == null) {
            C2359j c2359j = new C2359j();
            f8273c = c2359j;
            c2359j.f8274a = C2335V.m9949g();
            f8273c.f8274a.m9964t(new a());
        }
    }

    /* JADX INFO: renamed from: i */
    static void m10091i(Drawable drawable, C2344b0 c2344b0, int[] iArr) {
        C2335V.m9957v(drawable, c2344b0, iArr);
    }

    /* JADX INFO: renamed from: c */
    public synchronized Drawable m10092c(Context context, int i7) {
        return this.f8274a.m9958i(context, i7);
    }

    /* JADX INFO: renamed from: d */
    synchronized Drawable m10093d(Context context, int i7, boolean z7) {
        return this.f8274a.m9959j(context, i7, z7);
    }

    /* JADX INFO: renamed from: f */
    synchronized ColorStateList m10094f(Context context, int i7) {
        return this.f8274a.m9960l(context, i7);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m10095g(Context context) {
        this.f8274a.m9962r(context);
    }
}
