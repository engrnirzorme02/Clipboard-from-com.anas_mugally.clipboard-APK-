package p023C5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.content.AbstractC2436b;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import java.util.ArrayList;
import java.util.Arrays;
import p007A5.AbstractC0029b;
import p007A5.AbstractC0032e;
import p007A5.AbstractC0033f;
import p007A5.AbstractC0034g;
import p017C.AbstractC0101b;
import p033E.AbstractC0246a;
import p047F5.C0433a;

/* JADX INFO: renamed from: C5.c */
/* JADX INFO: loaded from: classes.dex */
public class C0148c implements InterfaceC0150e, InterfaceC0147b, InterfaceC0146a {

    /* JADX INFO: renamed from: a */
    private c f711a;

    /* JADX INFO: renamed from: b */
    private final long f712b;

    /* JADX INFO: renamed from: c */
    private final CharSequence f713c;

    /* JADX INFO: renamed from: d */
    private final int f714d;

    /* JADX INFO: renamed from: e */
    private final CharSequence f715e;

    /* JADX INFO: renamed from: f */
    private final int f716f;

    /* JADX INFO: renamed from: g */
    private final int f717g;

    /* JADX INFO: renamed from: h */
    private final int f718h;

    /* JADX INFO: renamed from: i */
    private final int f719i;

    /* JADX INFO: renamed from: j */
    private final int f720j;

    /* JADX INFO: renamed from: k */
    private final int f721k;

    /* JADX INFO: renamed from: l */
    private final boolean f722l;

    /* JADX INFO: renamed from: m */
    private final boolean f723m;

    /* JADX INFO: renamed from: n */
    private String[] f724n;

    /* JADX INFO: renamed from: o */
    private int f725o;

    /* JADX INFO: renamed from: p */
    private CharSequence f726p;

    /* JADX INFO: renamed from: q */
    private int f727q;

    /* JADX INFO: renamed from: r */
    private View.OnClickListener f728r;

    /* JADX INFO: renamed from: C5.c$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0148c.this.f711a.m12184m() != null) {
                AbstractC0101b.m388d(C0148c.this.f711a.m12184m(), C0148c.this.f724n, C0148c.this.f725o);
            }
        }
    }

    /* JADX INFO: renamed from: C5.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private int f730a = 0;

        /* JADX INFO: renamed from: b */
        private long f731b = 0;

        /* JADX INFO: renamed from: c */
        private int f732c = 0;

        /* JADX INFO: renamed from: d */
        private CharSequence f733d = null;

        /* JADX INFO: renamed from: e */
        private int f734e = 0;

        /* JADX INFO: renamed from: f */
        private CharSequence f735f = null;

        /* JADX INFO: renamed from: g */
        private int f736g = 0;

        /* JADX INFO: renamed from: h */
        private int f737h = 0;

        /* JADX INFO: renamed from: i */
        private int f738i = 0;

        /* JADX INFO: renamed from: j */
        private int f739j = AbstractC0033f.f179b;

        /* JADX INFO: renamed from: k */
        private boolean f740k = true;

        /* JADX INFO: renamed from: l */
        private boolean f741l = true;

        /* JADX INFO: renamed from: m */
        private String[] f742m = null;

        /* JADX INFO: renamed from: n */
        private CharSequence f743n = null;

        /* JADX INFO: renamed from: o */
        private int f744o = 0;

        /* JADX INFO: renamed from: p */
        private View.OnClickListener f745p = null;

        /* JADX INFO: renamed from: q */
        private int f746q = 34;

        /* JADX INFO: renamed from: A */
        public b m661A(CharSequence charSequence) {
            this.f733d = charSequence;
            this.f734e = 0;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m662B(int i7) {
            this.f738i = i7;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public b m663r(int i7) {
            this.f730a = i7;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public b m664s(int i7) {
            this.f732c = i7;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C0148c m665t() {
            if (this.f730a != 0) {
                return new C0148c(this);
            }
            throw new IllegalArgumentException("You must set a background.");
        }

        /* JADX INFO: renamed from: u */
        public b m666u(View.OnClickListener onClickListener) {
            this.f745p = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public b m667v(int i7) {
            this.f744o = i7;
            this.f743n = null;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public b m668w(int i7) {
            this.f736g = i7;
            this.f735f = null;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m669x(int i7) {
            this.f737h = i7;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m670y(boolean z7) {
            this.f739j = z7 ? AbstractC0033f.f180c : AbstractC0033f.f179b;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m671z(int i7) {
            this.f734e = i7;
            this.f733d = null;
            return this;
        }
    }

    /* JADX INFO: renamed from: C5.c$c */
    public static class c extends C0433a {

        /* JADX INFO: renamed from: p0 */
        private TextView f747p0 = null;

        /* JADX INFO: renamed from: q0 */
        private TextView f748q0 = null;

        /* JADX INFO: renamed from: r0 */
        private ImageView f749r0 = null;

        /* JADX INFO: renamed from: s0 */
        private VideoView f750s0 = null;

        /* JADX INFO: renamed from: C5.c$c$a */
        class a implements MediaPlayer.OnCompletionListener {
            a() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
            }
        }

        /* JADX INFO: renamed from: C5.c$c$b */
        class b implements MediaPlayer.OnErrorListener {
            b() {
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
                if (c.this.f750s0 == null) {
                    return true;
                }
                c.this.f750s0.setVisibility(8);
                return true;
            }
        }

        /* JADX INFO: renamed from: S1 */
        public static /* synthetic */ void m672S1(c cVar, MediaPlayer mediaPlayer) {
            cVar.getClass();
            mediaPlayer.setLooping(true);
            mediaPlayer.setVideoScalingMode(2);
            mediaPlayer.setVolume(0.0f, 0.0f);
            if (cVar.m12159a0()) {
                return;
            }
            mediaPlayer.seekTo(0);
        }

        /* JADX INFO: renamed from: U1 */
        public static c m674U1(long j7, CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, int i10, int i11, int i12, int i13) {
            Bundle bundle = new Bundle();
            bundle.putLong("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_ID", j7);
            bundle.putCharSequence("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_TITLE", charSequence);
            bundle.putInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_TITLE_RES", i7);
            bundle.putCharSequence("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_DESCRIPTION", charSequence2);
            bundle.putInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_DESCRIPTION_RES", i8);
            bundle.putInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_IMAGE_RES", i9);
            bundle.putInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_VIDEO_RES", i10);
            bundle.putInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_BACKGROUND_RES", i11);
            bundle.putInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_LAYOUT_RES", i12);
            bundle.putInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_PERMISSIONS_REQUEST_CODE", i13);
            c cVar = new c();
            cVar.m12117E1(bundle);
            return cVar;
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: A0 */
        public void mo675A0() {
            super.mo675A0();
            VideoView videoView = this.f750s0;
            if (videoView != null) {
                try {
                    if (videoView.isPlaying()) {
                        this.f750s0.stopPlayback();
                    }
                    this.f750s0.setOnPreparedListener(null);
                    this.f750s0.setOnCompletionListener(null);
                    this.f750s0.setOnErrorListener(null);
                } catch (Exception unused) {
                }
            }
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: C0 */
        public void mo676C0() {
            m12184m();
            VideoView videoView = this.f750s0;
            if (videoView != null) {
                try {
                    videoView.stopPlayback();
                    this.f750s0.setOnPreparedListener(null);
                    this.f750s0.setOnCompletionListener(null);
                    this.f750s0.setOnErrorListener(null);
                } catch (Exception unused) {
                }
            }
            this.f747p0 = null;
            this.f748q0 = null;
            this.f749r0 = null;
            this.f750s0 = null;
            super.mo676C0();
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: L0 */
        public void mo677L0() {
            super.mo677L0();
            VideoView videoView = this.f750s0;
            if (videoView == null || !videoView.isPlaying()) {
                return;
            }
            this.f750s0.pause();
            this.f750s0.seekTo(0);
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: N1 */
        public void mo678N1(boolean z7) {
            super.mo678N1(z7);
            VideoView videoView = this.f750s0;
            if (videoView != null) {
                if (z7 && videoView.getVisibility() == 0) {
                    if (this.f750s0.isPlaying()) {
                        return;
                    }
                    this.f750s0.seekTo(0);
                    this.f750s0.start();
                    return;
                }
                if (this.f750s0.isPlaying()) {
                    this.f750s0.pause();
                    this.f750s0.seekTo(0);
                }
            }
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: P0 */
        public void mo679P0(int i7, String[] strArr, int[] iArr) {
            if (i7 == (m12199s() != null ? m12199s().getInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_PERMISSIONS_REQUEST_CODE", 34) : 34)) {
                m368R1();
            }
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: Q0 */
        public void mo680Q0() {
            VideoView videoView;
            super.mo680Q0();
            m368R1();
            if (!m12159a0() || (videoView = this.f750s0) == null || videoView.getVisibility() != 0 || this.f750s0.isPlaying()) {
                return;
            }
            this.f750s0.seekTo(0);
            this.f750s0.start();
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: v0 */
        public void mo681v0(Bundle bundle) {
            super.mo681v0(bundle);
            m12136L1(true);
            m368R1();
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: z0 */
        public View mo682z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            int color;
            int color2;
            Bundle bundleM12199s = m12199s();
            View viewInflate = layoutInflater.inflate(bundleM12199s.getInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_LAYOUT_RES", AbstractC0033f.f179b), viewGroup, false);
            this.f747p0 = (TextView) viewInflate.findViewById(AbstractC0032e.f176i);
            this.f748q0 = (TextView) viewInflate.findViewById(AbstractC0032e.f171d);
            this.f749r0 = (ImageView) viewInflate.findViewById(AbstractC0032e.f173f);
            this.f750s0 = (VideoView) viewInflate.findViewById(AbstractC0032e.f177j);
            bundleM12199s.getLong("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_ID");
            CharSequence charSequence = bundleM12199s.getCharSequence("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_TITLE");
            int i7 = bundleM12199s.getInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_TITLE_RES");
            CharSequence charSequence2 = bundleM12199s.getCharSequence("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_DESCRIPTION");
            int i8 = bundleM12199s.getInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_DESCRIPTION_RES");
            int i9 = bundleM12199s.getInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_IMAGE_RES");
            int i10 = bundleM12199s.getInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_VIDEO_RES");
            int i11 = bundleM12199s.getInt("com.heinrichreimersoftware.materialintro.SimpleFragment.ARGUMENT_BACKGROUND_RES");
            TextView textView = this.f747p0;
            if (textView != null) {
                if (charSequence != null) {
                    textView.setText(charSequence);
                    this.f747p0.setVisibility(0);
                } else if (i7 != 0) {
                    textView.setText(i7);
                    this.f747p0.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            TextView textView2 = this.f748q0;
            if (textView2 != null) {
                if (charSequence2 != null) {
                    textView2.setText(charSequence2);
                    this.f748q0.setVisibility(0);
                } else if (i8 != 0) {
                    textView2.setText(i8);
                    this.f748q0.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
            }
            if (i9 != 0) {
                ImageView imageView = this.f749r0;
                if (imageView != null) {
                    try {
                        imageView.setImageResource(i9);
                        this.f749r0.setVisibility(0);
                    } catch (OutOfMemoryError unused) {
                        this.f749r0.setVisibility(8);
                    }
                }
                VideoView videoView = this.f750s0;
                if (videoView != null) {
                    videoView.setVisibility(8);
                }
            } else if (i10 != 0) {
                if (this.f750s0 != null) {
                    try {
                        this.f750s0.setVideoURI(Uri.parse("android.resource://" + m12184m().getPackageName() + "/" + i10));
                        this.f750s0.setVisibility(0);
                        this.f750s0.setAudioFocusRequest(0);
                        this.f750s0.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(256).build());
                        this.f750s0.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: C5.d
                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public final void onPrepared(MediaPlayer mediaPlayer) {
                                C0148c.c.m672S1(this.f753a, mediaPlayer);
                            }
                        });
                        this.f750s0.setOnCompletionListener(new a());
                        this.f750s0.setOnErrorListener(new b());
                        this.f750s0.seekTo(1);
                    } catch (Exception unused2) {
                        this.f750s0.setVisibility(8);
                    }
                }
                ImageView imageView2 = this.f749r0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            } else {
                ImageView imageView3 = this.f749r0;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                VideoView videoView2 = this.f750s0;
                if (videoView2 != null) {
                    videoView2.setVisibility(8);
                }
            }
            if (i11 == 0 || AbstractC0246a.m1175d(AbstractC2436b.getColor(m12204u(), i11)) >= 0.6d) {
                color = AbstractC2436b.getColor(m12204u(), AbstractC0029b.f158e);
                color2 = AbstractC2436b.getColor(m12204u(), AbstractC0029b.f160g);
            } else {
                color = AbstractC2436b.getColor(m12204u(), AbstractC0029b.f157d);
                color2 = AbstractC2436b.getColor(m12204u(), AbstractC0029b.f159f);
            }
            TextView textView3 = this.f747p0;
            if (textView3 != null) {
                textView3.setTextColor(color);
            }
            TextView textView4 = this.f748q0;
            if (textView4 != null) {
                textView4.setTextColor(color2);
            }
            m12184m();
            return viewInflate;
        }
    }

    protected C0148c(b bVar) {
        this.f726p = null;
        this.f727q = 0;
        this.f728r = null;
        this.f711a = c.m674U1(bVar.f731b, bVar.f733d, bVar.f734e, bVar.f735f, bVar.f736g, bVar.f737h, bVar.f738i, bVar.f730a, bVar.f739j, bVar.f746q);
        this.f712b = bVar.f731b;
        this.f713c = bVar.f733d;
        this.f714d = bVar.f734e;
        this.f715e = bVar.f735f;
        this.f716f = bVar.f736g;
        this.f717g = bVar.f737h;
        this.f718h = bVar.f738i;
        this.f719i = bVar.f739j;
        this.f720j = bVar.f730a;
        this.f721k = bVar.f732c;
        this.f722l = bVar.f740k;
        this.f723m = bVar.f741l;
        this.f724n = bVar.f742m;
        this.f725o = bVar.f746q;
        this.f726p = bVar.f743n;
        this.f727q = bVar.f744o;
        this.f728r = bVar.f745p;
        m638m();
    }

    /* JADX INFO: renamed from: m */
    private synchronized void m638m() {
        try {
            if (this.f724n != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f724n) {
                    if (this.f711a.m12204u() == null || AbstractC2436b.checkSelfPermission(this.f711a.m12204u(), str) != 0) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f724n = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } else {
                    this.f724n = null;
                }
            } else {
                this.f724n = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p023C5.InterfaceC0147b
    /* JADX INFO: renamed from: a */
    public void mo634a(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i instanceof c) {
            this.f711a = (c) abstractComponentCallbacksC2591i;
        }
    }

    @Override // p023C5.InterfaceC0146a
    /* JADX INFO: renamed from: b */
    public View.OnClickListener mo631b() {
        m638m();
        return this.f724n == null ? this.f728r : new a();
    }

    @Override // p023C5.InterfaceC0150e
    /* JADX INFO: renamed from: c */
    public int mo639c() {
        return this.f720j;
    }

    @Override // p023C5.InterfaceC0150e
    /* JADX INFO: renamed from: d */
    public int mo640d() {
        return this.f721k;
    }

    @Override // p023C5.InterfaceC0150e
    /* JADX INFO: renamed from: e */
    public AbstractComponentCallbacksC2591i mo641e() {
        return this.f711a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0148c c0148c = (C0148c) obj;
            if (this.f712b != c0148c.f712b || this.f714d != c0148c.f714d || this.f716f != c0148c.f716f || this.f717g != c0148c.f717g || this.f718h != c0148c.f718h || this.f719i != c0148c.f719i || this.f720j != c0148c.f720j || this.f721k != c0148c.f721k || this.f722l != c0148c.f722l || this.f723m != c0148c.f723m || this.f725o != c0148c.f725o || this.f727q != c0148c.f727q) {
                return false;
            }
            c cVar = this.f711a;
            if (cVar == null ? c0148c.f711a != null : !cVar.equals(c0148c.f711a)) {
                return false;
            }
            CharSequence charSequence = this.f713c;
            if (charSequence == null ? c0148c.f713c != null : !charSequence.equals(c0148c.f713c)) {
                return false;
            }
            CharSequence charSequence2 = this.f715e;
            if (charSequence2 == null ? c0148c.f715e != null : !charSequence2.equals(c0148c.f715e)) {
                return false;
            }
            if (!Arrays.equals(this.f724n, c0148c.f724n)) {
                return false;
            }
            CharSequence charSequence3 = this.f726p;
            if (charSequence3 == null ? c0148c.f726p != null : !charSequence3.equals(c0148c.f726p)) {
                return false;
            }
            View.OnClickListener onClickListener = this.f728r;
            View.OnClickListener onClickListener2 = c0148c.f728r;
            if (onClickListener != null) {
                return onClickListener.equals(onClickListener2);
            }
            if (onClickListener2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // p023C5.InterfaceC0150e
    /* JADX INFO: renamed from: f */
    public boolean mo642f() {
        m638m();
        return this.f722l && this.f724n == null;
    }

    @Override // p023C5.InterfaceC0150e
    /* JADX INFO: renamed from: g */
    public boolean mo643g() {
        return this.f723m;
    }

    @Override // p023C5.InterfaceC0146a
    /* JADX INFO: renamed from: h */
    public int mo632h() {
        m638m();
        if (this.f724n == null) {
            return this.f727q;
        }
        return 0;
    }

    public int hashCode() {
        c cVar = this.f711a;
        int iHashCode = (((cVar != null ? cVar.hashCode() : 0) * 31) + Long.valueOf(this.f712b).hashCode()) * 31;
        CharSequence charSequence = this.f713c;
        int iHashCode2 = (((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.f714d) * 31;
        CharSequence charSequence2 = this.f715e;
        int iHashCode3 = (((((((((((((((((((((iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + this.f716f) * 31) + this.f717g) * 31) + this.f718h) * 31) + this.f719i) * 31) + this.f720j) * 31) + this.f721k) * 31) + (this.f722l ? 1 : 0)) * 31) + (this.f723m ? 1 : 0)) * 31) + Arrays.hashCode(this.f724n)) * 31) + this.f725o) * 31;
        CharSequence charSequence3 = this.f726p;
        int iHashCode4 = (((iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31) + this.f727q) * 31;
        View.OnClickListener onClickListener = this.f728r;
        return iHashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    @Override // p023C5.InterfaceC0146a
    /* JADX INFO: renamed from: i */
    public CharSequence mo633i() {
        m638m();
        if (this.f724n == null) {
            return this.f726p;
        }
        Context contextM12204u = this.f711a.m12204u();
        if (contextM12204u != null) {
            return contextM12204u.getResources().getQuantityText(AbstractC0034g.f181a, this.f724n.length);
        }
        return null;
    }
}
