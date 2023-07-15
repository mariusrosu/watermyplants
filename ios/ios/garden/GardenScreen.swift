//
//  GardenScreen.swift
//  ios
//
//  Created by Marius Andrei Rosu on 15.07.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct GardenScreen: View {
    
    @ObservedObject var viewModel: GardenViewModel
    
    init() {
        self.viewModel = GardenViewModel()
    }
    
    var body: some View {
        VStack {
            Spacer()
            Text(viewModel.state.titleState.text)
            Spacer()
        }
        .onAppear {
            viewModel.startObserving()
        }
        .onDisappear {
            viewModel.dispose()
        }
    }
}

struct GardenScreen_Previews: PreviewProvider {
    static var previews: some View {
        GardenScreen()
    }
}
