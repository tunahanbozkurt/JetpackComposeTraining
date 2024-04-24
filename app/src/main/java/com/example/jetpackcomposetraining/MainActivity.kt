package com.example.jetpackcomposetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.jetpackcomposetraining.ui.theme.LocalMuviTypography
import com.example.jetpackcomposetraining.ui.theme.Primary500
import com.example.jetpackcomposetraining.ui.theme.TransparentRed

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailScreen()
        }
    }
}

@Composable
fun DetailScreen() {
    LazyColumn {
        item { Header() }
        item { Details() }
        item { CrewSection() }
        item { EpisodeSection() }
        item { TabSection() }
        items(10) {
            tabItem()
        }
    }
}

@Composable
fun Header() {
    BoxWithConstraints(
        modifier = Modifier.aspectRatio(1.12f)
    ) {
        AsyncImage(
            model = "https://thesoutherneronline.com/wp-content/uploads/2017/12/strangerthingsheader.jpg",
            contentDescription = null,
            modifier = Modifier.fillMaxSize().background(Color.DarkGray),
            contentScale = ContentScale.Crop
        )

        Toolbar(
            Modifier
                .fillMaxWidth()
                .padding(top = maxHeight * 0.21f)
                .padding(horizontal = 24.dp)
        )
    }
}

@Composable
fun Toolbar(
    modifier: Modifier = Modifier,
    tint: Color = Color.White,
    onClick: () -> Unit = {}
) {
    CompositionLocalProvider(
        LocalContentColor provides tint
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = null,
                modifier = Modifier.clickable {
                    onClick.invoke()
                }
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_smart_cast),
                contentDescription = null
            )
        }
    }
}

@Composable
fun Details() {
    Column(
        modifier = Modifier.padding(horizontal = 24.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Stranger Things",
                style = LocalMuviTypography.current.heading.heading4,
                color = Color.Black,
                modifier = Modifier.weight(1f)
            )

            Icon(painter = painterResource(id = R.drawable.ic_bookmark), contentDescription = null)

            Spacer(modifier = Modifier.width(12.dp))

            Icon(painter = painterResource(id = R.drawable.ic_send), contentDescription = null)
        }

        Spacer(modifier = Modifier.height(24.dp))

        CompositionLocalProvider(
            LocalContentColor provides Primary500
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Rating(rate = 9.8f)
                Text(
                    text = "2022",
                    style = LocalMuviTypography.current.body.mediumSemiBold,
                    color = Color.Black
                )
                Feature(text = "13+")
                Feature(text = "United States")
                Feature(text = "Subtitle")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilledButton(
                text = {
                    Text(text = "Play", color = Color.White, fontWeight = FontWeight.Medium)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_play),
                        contentDescription = null,
                        tint = Color.White
                    )
                },
                modifier = Modifier.weight(1f)
            )

            OutlinedButton(
                text = {
                    Text(text = "Download", color = Primary500, fontWeight = FontWeight.Medium)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_download),
                        contentDescription = null,
                        tint = Primary500
                    )
                },
                modifier = Modifier.weight(1f)
            )

        }
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat... View More")

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun Rating(
    rate: Float
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_star), contentDescription = null)

        Text(text = rate.toString(), style = LocalMuviTypography.current.body.mediumMedium)

        Icon(painter = painterResource(id = R.drawable.ic_arrow_right), contentDescription = null)
    }
}

@Composable
fun Feature(
    text: String,
    color: Color = LocalContentColor.current
) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        style = LocalMuviTypography.current.body.xSmallSemiBold,
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .border(1.dp, color, RoundedCornerShape(6.dp))
            .padding(vertical = 6.dp, horizontal = 10.dp)
    )
}

@Composable
fun FilledButton(
    modifier: Modifier = Modifier,
    text: @Composable () -> Unit,
    icon: @Composable () -> Unit
) {
    Row(
        modifier = modifier
            .clip(CircleShape)
            .background(Primary500)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    ) {
        icon()
        text()
    }
}

@Composable
fun OutlinedButton(
    modifier: Modifier = Modifier,
    text: @Composable () -> Unit,
    icon: @Composable () -> Unit
) {
    Row(
        modifier = modifier
            .clip(CircleShape)
            .border(2.dp, Primary500, CircleShape)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    ) {
        icon()
        text()
    }
}

@Composable
fun CrewSection() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        items(10) {
            CrewItem()
        }
    }
}

@Composable
fun CrewItem() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        AsyncImage(
            model = "https://thesoutherneronline.com/wp-content/uploads/2017/12/strangerthingsheader.jpg",
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Red)
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "Shawn Levy",
                fontWeight = FontWeight.Medium,
                modifier = Modifier.width(IntrinsicSize.Min)
            )
            Text(
                text = "Director",
                fontWeight = FontWeight.Medium,
                modifier = Modifier,
                color = Color(0xFF616161)
            )
        }
    }
}

@Composable
fun EpisodeSection() {
    Column {
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            Text(
                text = "Episodes",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
                fontSize = 18.sp
            )
            Text(
                text = "Season 4",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Primary500
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_down),
                contentDescription = null,
                tint = Primary500
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(10) {
                EpisodeItem()
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun EpisodeItem() {
    Box {
        AsyncImage(
            model = "https://thesoutherneronline.com/wp-content/uploads/2017/12/strangerthingsheader.jpg",
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp, 133.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.Green)
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_play),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )

        Text(
            text = "Episode 1",
            fontWeight = FontWeight.Medium,
            color = Color.White,
            modifier = Modifier
                .padding(start = 12.dp, bottom = 12.dp)
                .align(
                    Alignment.BottomStart
                )
        )
    }
}

@Composable
fun TabSection() {
    TabRow(selectedTabIndex = 0, Modifier.fillMaxWidth().padding(horizontal = 24.dp)) {
        Tab(selected = true, onClick = { /*TODO*/ }) {
            Text(text = "Trailers")
        }
        Tab(selected = false, onClick = { /*TODO*/ }) {
            Text(text = "More Like This")
        }
        Tab(selected = false, onClick = { /*TODO*/ }) {
            Text(text = "Comments")
        }
    }
}

@Composable
fun LazyItemScope.tabItem() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.padding(start = 24.dp, top = 24.dp)
    ) {
        Box {
            AsyncImage(
                model = "https://thesoutherneronline.com/wp-content/uploads/2017/12/strangerthingsheader.jpg",
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp, 113.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.Blue)
            )

            Icon(
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(text = "Trailer 3:Final", fontWeight = FontWeight.Bold)
            Text(text = "1m 56s", fontWeight = FontWeight.SemiBold)
            Text(
                text = "Update",
                color = Primary500,
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(TransparentRed)
                    .padding(vertical = 6.dp, horizontal = 10.dp)
            )
        }
    }
}

@PreviewMuviScreenSizes
@Composable
private fun DetailScreenPreview() {
    LazyColumn {
        item { Header() }
        item { Details() }
        item { CrewSection() }
        item { EpisodeSection() }
        item { TabSection() }
        items(10) {
            tabItem()
        }
    }
}