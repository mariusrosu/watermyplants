//
//  GardenViewModel.swift
//  ios
//
//  Created by Marius Andrei Rosu on 15.07.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import shared

extension GardenScreen {
    @MainActor class GardenViewModel: ObservableObject {
        
        private let viewModel: SharedGardenViewModel
        
        @Published var state: GardenUiState = GardenUiState.Loading()
        
        private var handle: DisposableHandle?
        
        init() {
            self.viewModel = SharedGardenViewModel(coroutineScope: nil)
        }
        
        func startObserving() {
            handle = viewModel.state.subscribe(onCollect: { state in
                if let state = state {
                    self.state = state
                }
            }) as? DisposableHandle
            //TODO: Fix handle dispose
        }
        
        // Removes the listener
        func dispose() {
            handle?.dispose()
        }
    }
}
